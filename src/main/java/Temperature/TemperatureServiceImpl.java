package Temperature;

import com.ayo.temperature.*;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;

public class TemperatureServiceImpl extends TemperatureServiceGrpc.TemperatureServiceImplBase {
    ArrayList<Temperature> temperatures = new ArrayList<>();
    // Constructor to initialize sample data
    public TemperatureServiceImpl() {
        // Sample data initialization
        temperatures.add(new Temperature(20.0));
        temperatures.add(new Temperature(21.0));
        temperatures.add(new Temperature(24.0));
        temperatures.add(new Temperature(19.0));
        temperatures.add(new Temperature(18.0));
        temperatures.add(new Temperature(17.0));
        temperatures.add(new Temperature(19.4));
    }
    public void streamTemperature(TemperatureRequest request, StreamObserver<TemperatureData> responseObserver) {
        try {

            // Stream temperature data from the ArrayList to the client
            for (Temperature temperature : temperatures) {
                TemperatureData temperatureData = TemperatureData.newBuilder().setTemperature(temperature.getTempData()).build();
                responseObserver.onNext(temperatureData);
                Thread.sleep(3000); // Simulate delay (1 second)
            }
            responseObserver.onCompleted(); // Stream completed
        } catch (InterruptedException e) {
            e.printStackTrace();
            responseObserver.onError(e); // Error occurred
        }
    }


}
