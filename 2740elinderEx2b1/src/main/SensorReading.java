package main;

import java.time.LocalDateTime;

public class SensorReading {
    private int sensorReadingId;
    private int sensorId;
    private LocalDateTime readingDateTime;
    private double temperature;

    public SensorReading(int sensorReadingId, int sensorId, double temperature) {
        this.sensorReadingId = sensorReadingId;
        this.sensorId = sensorId;
        this.readingDateTime = LocalDateTime.now();
        this.temperature = temperature;
    }

    public SensorReading() {
        this.sensorReadingId = 0;
        this.sensorId = 0;
        this.readingDateTime = LocalDateTime.now();
        this.temperature = 0;
    }
    public void setSensorReadingId(int sensorReadingId){
        this.sensorReadingId = sensorReadingId;
    }
    public int getSensorReadingId(){
        return this.sensorReadingId;
    }

    public int getSensorId() {
        return this.sensorId;
    }

    public void setSensorId(int sensorId) {
        this.sensorId = sensorId;
    }

    public LocalDateTime getReadingDateTime() {
        return this.readingDateTime;
    }

    public void setReadingDateTime(LocalDateTime readingDateTime) {
        this.readingDateTime = readingDateTime;
    }

    public double getTemperature() {
        return this.temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    @Override
    public String toString() {
        return
                  "\nSensorReading:" +
                "\tId = " + sensorReadingId +
                        "\tsensorId = " + sensorId +
                        "\treadingTime = " + readingDateTime +
                        "\ttemperature = " + temperature;

    }
}

