package Inventory;

import com.ayo.inventorymanagement.*;
import controller.SmartWarehouseController;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;

public class InventoryClient {
    private final ManagedChannel channel;
    private final InventoryManagementServiceGrpc.InventoryManagementServiceStub stub;

    public InventoryClient(String host, int port) {
        channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();

        // Create an async stub for streaming communication
        stub = InventoryManagementServiceGrpc.newStub(channel);
    }

    public void streamProductQuantities() {
        // Create a StreamObserver to handle responses from the server
        StreamObserver<ProductQuantity> responseObserver = new StreamObserver<ProductQuantity>() {
            @Override
            public void onNext(ProductQuantity productQuantity) {
                // Handle response from the server
                System.out.println("Product ID: " + productQuantity.getProductId() + ", Quantity: " + productQuantity.getQuantity());
                SmartWarehouseController.getInstance().updateOutput(productQuantity);
            }

            @Override
            public void onError(Throwable throwable) {
                // Handle error from the server
                System.err.println("Error streaming product quantities: " + throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                // Handle completion of the stream
                System.out.println("Streaming completed");
            }
        };

        // Create a StreamObserver for the client to stream products
        StreamObserver<Product> requestObserver = stub.streamProductQuantities(responseObserver);
       try{
           for (ProductData product : getProducts()) {
               requestObserver.onNext(Product.newBuilder()
                       .setId(product.getId())
                       .setName(product.getName())
                       .setQuantity(product.getQuantity())
                       .build());
           }
       } catch (Exception e){
           System.out.println("error sending: " + e.getMessage());
       }

        // Notify the server that the stream is complete
        requestObserver.onCompleted();
    }

    private List<ProductData> getProducts() {
        // Create an array of products
        List<ProductData> products = new ArrayList<>();
        products.add(new ProductData("1", "Shirts", 10));
        products.add(new ProductData("2", "Caps", 20));
        products.add(new ProductData("3", "Shorts", 30));
        products.add(new ProductData("4", "Socks", 40));
        products.add(new ProductData("5", "Shoes", 5));
        products.add(new ProductData("6", "Hats", 10));
        products.add(new ProductData("7", "lace", 20));
        return products;
    }

    public void shutdown() {
        // Shutdown the channel when done
        channel.shutdown();
    }

    public static void main(String[] args) {
        InventoryClient client = new InventoryClient("localhost", 5001);
        client.streamProductQuantities();
        client.shutdown();
    }

}
