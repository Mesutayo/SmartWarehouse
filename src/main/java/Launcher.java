import Inventory.InventoryServer;
import OrderProcessinng.OrderProcessingServer;
import Temperature.TemperatureServer;

public class Launcher {
    public static void main(String[] args) {
        Thread serverThread = new Thread(() -> {
            try {
                // Start your server here
              final TemperatureServer server = new TemperatureServer();
              final OrderProcessingServer orderProcessingServer = new OrderProcessingServer();
              final InventoryServer inventoryServer = new InventoryServer();
                server.start();
                orderProcessingServer.start();
                inventoryServer.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        serverThread.start();
        SmartWarehouseApp.main(args);
    }
}
