package OrderProcessinng;

import com.ayo.orderprocessing.OrderProcessingServiceGrpc;
import com.ayo.orderprocessing.ProcessOrderRequest;
import com.ayo.orderprocessing.ProcessOrderResponse;
import io.grpc.stub.StreamObserver;

public class OrderProcessingServerImpl extends OrderProcessingServiceGrpc.OrderProcessingServiceImplBase {
    @Override
    public void processOrder(ProcessOrderRequest request, StreamObserver<ProcessOrderResponse> responseObserver) {
        // Implement your processing logic here
        System.out.println("Received order: " + request.getOrderId());
        // Assume processing logic is successful
        ProcessOrderResponse response = ProcessOrderResponse.newBuilder()
                .setOrderId(request.getOrderId())
                .setSuccess(true)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<ProcessOrderRequest> streamProcessOrders(final StreamObserver<ProcessOrderResponse> responseObserver) {
        return new StreamObserver<ProcessOrderRequest>() {
            @Override
            public void onNext(ProcessOrderRequest request) {
                // Implement your streaming processing logic here
                System.out.println("Received order: " + request.getOrderId());

                ProcessOrderResponse response = ProcessOrderResponse.newBuilder()
                        .setOrderId(request.getOrderId())
                        .setSuccess(true)
                        .build();
                responseObserver.onNext(response);
            }

            @Override
            public void onError(Throwable t) {
                // Handle errors here
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
}
