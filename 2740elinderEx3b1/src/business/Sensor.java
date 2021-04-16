package business;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Sensor {
    private int sensorId;
    private int roomId;
    private int sensorTypeId;
    private String description;
    private SensorReading[] sensorReadings = new SensorReading[50];

    private static int nextSensorId = 101;
    private int nextSensorReadingIndex = 0;

    public Sensor(int roomId, int sensorTypeId, String description) {
        this.sensorId = nextSensorId++;
        this.roomId = roomId;
        this.sensorTypeId = sensorTypeId;
        this.description = description;
    }

    public int getSensorId() {
        return sensorId;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getSensorTypeId() {
        return sensorTypeId;
    }

    public void setSensorTypeId(int sensorTypeId) {
        this.sensorTypeId = sensorTypeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void addSensorReading (float value) {
        this.sensorReadings[nextSensorReadingIndex] =
                new SensorReading(nextSensorReadingIndex + 1001, this.sensorId, value);
        nextSensorReadingIndex++;
    }

    public float minReading() {
        float minValue = sensorReadings[0].getValue();

        for(int i = 0; i < sensorReadings.length; i++){
            if(sensorReadings[i].getValue() < minValue){
                minValue = sensorReadings[i].getValue();
            }
        }
        minValue = Math.round(minValue * 10.0f / 10.0f);
        return minValue;
    }

    public float maxReading() {
        float maxValue = sensorReadings[0].getValue();

        for(int i = 0; i < sensorReadings.length; i++){
            if(sensorReadings[i].getValue() > maxValue){
                maxValue = sensorReadings[i].getValue();
            }
        }
        maxValue = Math.round(maxValue * 10.0f / 10.0f);
        return maxValue;
    }

    public float avgReading() {
        float sum = 0;
        for (int i = 0; i < sensorReadings.length; i++) {
            sum += sensorReadings[i].getValue() / 50;
        }
     sum = Math.round(sum * 10.0f / 10.0f);
        return sum;
    }
    }
