package Inventory;

import com.ayo.inventorymanagement.*;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.List;

public class InventoryServerImpl extends InventoryManagementServiceGrpc.InventoryManagementServiceImplBase {
    private final List<ProductData> products = new ArrayList<>();

    public  InventoryServerImpl(){
        products.add(new ProductData("1", "Shirts", 10));
        products.add(new ProductData("2", "Caps", 20));
        products.add(new ProductData("3", "Shorts", 30));
        products.add(new ProductData("4", "Socks", 40));
        products.add(new ProductData("5", "Shoes", 50));
    }

    @Override
    public StreamObserver<Product> streamProductQuantities(StreamObserver<ProductQuantity> responseObserver) {
        return new StreamObserver<Product>() {
            @Override
            public void onNext(Product product) {
                // Assume you have a method to get the quantity of a product by its ID
                int quantity = getProductQuantity(product.getId());
                // Create a ProductQuantity object and send it back to the client
                System.out.println("heramaybe");
                ProductQuantity productQuantity = ProductQuantity.newBuilder()
                        .setProductId(product.getId())
                        .setQuantity(quantity)
                        .build();
                responseObserver.onNext(productQuantity);
            }

            @Override
            public void onError(Throwable throwable) {
                System.err.println("Error streaming product quantities: " + throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }

    private int getProductQuantity(String productId) {
        for (ProductData product : products) {
            if (product.getId().equals(productId)) {
                return product.getQuantity();
            }
        }
        // If the product ID is not found, return -1 or handle appropriately
        return -1;
    }

    @Override
    public void addProduct(AddProductRequest request, StreamObserver <AddProductResponse> responseObserver) {
        ProductData newProduct = new ProductData(String.valueOf(products.size() + 1), request.getName(), request.getQuantity());
        products.add(newProduct);
        AddProductResponse response = AddProductResponse.newBuilder()
                .setProductId(newProduct.getId())
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

}
