package project.adapter;

public class TemperatureReader implements ITemperatureReader{
    private final Thermometer thermometer;

    public TemperatureReader(Thermometer thermometer) {
        this.thermometer = thermometer;
    }

    public double getTemperature(){
        return thermometer.getTemperature() - 273.5;
    }
}
