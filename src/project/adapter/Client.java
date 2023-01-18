package project.adapter;

public class Client {
    ITemperatureReader iTemperatureReader;

    public Client(ITemperatureReader iTemperatureReader) {
        this.iTemperatureReader = iTemperatureReader;
    }

    public void viewTemperature(){
        System.out.println(iTemperatureReader.getTemperature());
    }
}
