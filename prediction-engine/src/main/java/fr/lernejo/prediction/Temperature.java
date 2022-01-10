package fr.lernejo.prediction;

public class Temperature {
    private String date;
    private  double temperature;

    public Temperature(String date, double temperature) {
        this.date = date;
        this.temperature = temperature;
    }

    public String getDate() {
        return date;
    }

    public double getTemperature() {
        return temperature;
    }
}
