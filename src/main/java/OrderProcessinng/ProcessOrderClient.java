package OrderProcessinng;
import com.ayo.orderprocessing.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class ProcessOrderClient {

    private final ManagedChannel channel;
    private final OrderProcessingServiceGrpc.OrderProcessingServiceStub stub;

    public ProcessOrderClient(String host, int port) {
        // Create a channel to communicate with the gRPC server
        channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext() // For simplicity, use plaintext communication
                .build();

        // Create a stub for the gRPC service
        stub = OrderProcessingServiceGrpc.newStub(channel);
    }

    public void streamProcessOrders() {
        // Create a StreamObserver to handle responses from the server
        StreamObserver <ProcessOrderResponse> responseObserver = new StreamObserver <ProcessOrderResponse>() {
            @Override
            public void onNext(ProcessOrderResponse response) {
                // Handle the response from the server
                System.out.println("Order processed successfully: " + response.getOrderId());
            }

            @Override
            public void onError(Throwable throwable) {
                // Handle errors from the server
                System.err.println("Error processing order: " + throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                // Handle completion of the stream
                System.out.println("Order processing completed");
            }
        };

        // Create a StreamObserver for the client to stream orders
        StreamObserver  <ProcessOrderRequest> requestObserver = stub.streamProcessOrders(responseObserver);

        // Stream some orders to the server
        // You can replace this with your actual logic to stream orders
        requestObserver.onNext(ProcessOrderRequest.newBuilder().setOrderId("1").build());
        requestObserver.onNext(ProcessOrderRequest.newBuilder().setOrderId("2").build());
        requestObserver.onNext(ProcessOrderRequest.newBuilder().setOrderId("3").build());

        // Notify the server that the stream is complete
        requestObserver.onCompleted();
    }

    public void shutdown() {
        // Shutdown the channel when done
        channel.shutdown();
    }

    public static void main(String[] args) {
        ProcessOrderClient client = new ProcessOrderClient("localhost", 5002);
        client.streamProcessOrders();
    }
}



