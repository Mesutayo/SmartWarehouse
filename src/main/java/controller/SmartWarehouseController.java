package controller;

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
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;

import java.util.ArrayList;
import java.util.List;

public class SmartWarehouseController {
    
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

    String name;
    int quantity;

    List<ProcessOrderRequest.OrderItem> orderItems = new ArrayList<>();
    private ArrayList<String> productInfo = new ArrayList<>();

    @FXML
    public void initialize(){

        orderItems.add(ProcessOrderRequest.OrderItem.newBuilder().setProductId("1").setQuantity(2).build());
        orderItems.add(ProcessOrderRequest.OrderItem.newBuilder().setProductId("2").setQuantity(1).build());
        orderItems.add(ProcessOrderRequest.OrderItem.newBuilder().setProductId("3").setQuantity(5).build());
        orderItems.add(ProcessOrderRequest.OrderItem.newBuilder().setProductId("4").setQuantity(6).build());


        rectanglesContainer.getChildren().clear();

        // Create rectangles based on the number of order items
        for (ProcessOrderRequest.OrderItem orderItem : orderItems) {
            Rectangle rectangle = new Rectangle(50, 50, getRandomColor()); // Example: red color
            rectanglesContainer.getChildren().add(rectangle);

            Label label = new Label("ID: " + orderItem.getProductId());
            label.setFont(Font.font(50)); // Set font size if needed
            rectanglesContainer.getChildren().add(label);


        }
    }
    private Color getRandomColor() {
        double red = Math.random();
        double green = Math.random();
        double blue = Math.random();
        return new Color(red, green, blue, 1);
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
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 5002)
                .usePlaintext()
                .build();

        OrderProcessingServiceGrpc.OrderProcessingServiceStub stub = OrderProcessingServiceGrpc.newStub(channel);

        // Create a ProcessOrderRequest
        ProcessOrderRequest request = ProcessOrderRequest.newBuilder()
                .setOrderId("123")
                .addAllItems(orderItems)
                .build();

        // Call the processOrder RPC
        stub.processOrder(request, new StreamObserver   <ProcessOrderResponse>() {
            @Override
            public void onNext(ProcessOrderResponse response) {
                Platform.runLater(() ->
                        System.out.println("Order processed. Success: " + response.getSuccess())
                );
            }

            @Override
            public void onError(Throwable t) {
                Platform.runLater(() ->
                        System.err.println("Error processing order: " + t.getMessage())
                );
            }

            @Override
            public void onCompleted() {
                Platform.runLater(() ->
                        System.out.println("Order processing completed.")
                );
                channel.shutdownNow();
            }
        });
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
        // Construct the string to display product info
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
}
