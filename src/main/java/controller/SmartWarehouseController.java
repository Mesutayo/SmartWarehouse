package controller;

import com.ayo.temperature.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class SmartWarehouseController {
    
    public Label temperatureData;
    public Button streamTemperatureButton;


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
}
