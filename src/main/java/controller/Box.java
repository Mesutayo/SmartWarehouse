package controller;


import javafx.scene.paint.Color;

public class Box {
    private String productId;
    private Color color;

    public Box(String productId, Color color) {
        this.productId = productId;
        this.color = color;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Box{" +
                "productId='" + productId + '\'' +
                ", color=" + color +
                '}';
    }
}
