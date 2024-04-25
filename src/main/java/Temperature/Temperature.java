package Temperature;

public class Temperature {
    double tempData;

    public Temperature(double tempData) {
        this.tempData = tempData;
    }

    public double getTempData() {
        return tempData;
    }

    public void setTempData(double tempData) {
        this.tempData = tempData;
    }

    @Override
    public String toString() {
        return "Temperature{" +
                "tempData=" + tempData +
                '}';
    }
}
