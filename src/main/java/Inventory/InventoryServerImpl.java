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
    public StreamObserver<UpdateStockRequest> updateStock(StreamObserver  <UpdateStockResponse> responseObserver) {
        return new StreamObserver<UpdateStockRequest>() {
            @Override
            public void onNext(UpdateStockRequest request) {
                boolean productFound = false;
                for (ProductData product : products) {
                    if (product.getId().equals(request.getProductId())) {
                        int newQuantity = product.getQuantity() + request.getQuantityChange();
                        product.setQuantity(newQuantity);
                        UpdateStockResponse response = UpdateStockResponse.newBuilder()
                                .setProductId(request.getProductId())
                                .setNewQuantity(newQuantity)
                                .setStatus("Stock updated successfully")
                                .build();
                        responseObserver.onNext(response);
                        productFound = true;
                        break;
                    }
                }
                if (!productFound) {
                    UpdateStockResponse response = UpdateStockResponse.newBuilder()
                            .setProductId(request.getProductId())
                            .setStatus("Product not found")
                            .build();
                    responseObserver.onNext(response);
                }
            }

            @Override
            public void onError(Throwable throwable) {
                System.err.println("Error updating stock: " + throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
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
