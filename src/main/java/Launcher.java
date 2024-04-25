import Temperature.TemperatureServer;

public class Launcher {
    public static void main(String[] args) {
        Thread serverThread = new Thread(() -> {
            try {
                // Start your server here
              final   TemperatureServer server = new TemperatureServer();
                server.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        serverThread.start();
        SmartWarehouseApp.main(args);
    }
}
