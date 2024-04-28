package controller;

import Inventory.InventoryClient;
import com.ayo.inventorymanagement.*;
import com.ayo.orderprocessing.*;
import com.ayo.temperature.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;

import java.util.ArrayList;
import java.util.List;

public class SmartWarehouseController {

    private InventoryClient inventoryClient;

    public static SmartWarehouseController instance;
    public Label temperatureData;
    public Button streamTemperatureButton;
    public Button processOrderButton;
    @FXML
    public HBox rectanglesContainer;
    public Label orderlabels;
    public TextField productName;
    public TextField productQuantity;
    public Button addProductButton;
    public Label productInfoLabel;
    public Button startStreamingButton;
    public TextArea outputTextArea;

    String name;
    int quantity;

   public SmartWarehouseController(){
       instance = this;
   }
    public static SmartWarehouseController getInstance() {
        return instance;
    }

    List<ProcessOrderRequest.OrderItem> orderItems = new ArrayList<>();
    private ArrayList<String> productInfo = new ArrayList<>();

    @FXML
    public void initialize(){
        inventoryClient = new InventoryClient("localhost", 5001);

    }

    public void streamTemperatureAction(ActionEvent mouseEvent) {
        System.out.println("stream sensed");
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 5000)
                .usePlaintext()
                .build();
        TemperatureServiceGrpc.TemperatureServiceStub stub = TemperatureServiceGrpc.newStub(channel);

        stub.streamTemperature(TemperatureRequest.newBuilder().build(), new StreamObserver<TemperatureData>() {
            @Override
            public void onNext(TemperatureData data) {
                Platform.runLater(() ->
                        temperatureData.setText(data.getTemperature() + "°C")
                );
            }

            @Override
            public void onError(Throwable t) {
                Platform.runLater(() ->
                        temperatureData.setText("Error: " + t.getMessage() + "\n")
                );
            }

            @Override
            public void onCompleted() {
                Platform.runLater(() ->
                        temperatureData.setText("Stream completed.\n")
                );
                channel.shutdownNow();
            }
        });
    }

    public void processOrderAction(ActionEvent actionEvent) {


    }

    public void addProductAction(ActionEvent actionEvent) {
        String name = productName.getText();
        int quantity = Integer.parseInt(productQuantity.getText());

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 5001)
                .usePlaintext()
                .build();

        InventoryManagementServiceGrpc.InventoryManagementServiceBlockingStub stub =
                InventoryManagementServiceGrpc.newBlockingStub(channel);


        AddProductRequest request = AddProductRequest.newBuilder()
                .setName(name)
                .setQuantity(quantity)
                .build();

        AddProductResponse response = stub.addProduct(request);

        // Add the product ID to the ArrayList
        productInfo.add("Name: " + name + ", Quantity: " + quantity + ", ID: " + response.getProductId());


        // Update the product IDs label
        updateProductInfoLabel();

        // Clear the TextFields
        productName.clear();
        productQuantity.clear();

        // Shutdown the channel when done
        channel.shutdown();
    }

    private void updateProductInfoLabel() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String info : productInfo) {
            stringBuilder.append(info).append("\n");
        }
        // Set the text of the product info label
        productInfoLabel.setText(stringBuilder.toString());
    }

    public void productNameAction(ActionEvent actionEvent) {
        name = (productName.getText());
    }

    public void producQuantityAction(ActionEvent actionEvent) {
        quantity = Integer.parseInt(productQuantity.getText());
    }

    public void updateOutput(ProductQuantity productQuantity) {
        // Update the output text area with the received product quantity
        outputTextArea.appendText("Product ID: " + productQuantity.getProductId() + ", Quantity: " + productQuantity.getQuantity() + "\n");
    }

    public void startStreaming(ActionEvent actionEvent) {
        // Call the streamProductQuantities method of the InventoryClient
        inventoryClient.streamProductQuantities();
    }

}
