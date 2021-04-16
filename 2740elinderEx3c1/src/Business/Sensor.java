package Business;

import java.util.ArrayList;

public class Sensor {
    private int sensorId;
    private int roomId;
    private int sensorTypeId;
    private String description;
    private ArrayList<SensorReading> sensorReadings = new ArrayList<>();

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
        this.sensorReadings.add(
                new SensorReading(nextSensorReadingIndex + 1001, this.sensorId, value));
        nextSensorReadingIndex++;
    }

    public float minReading() {
        float minimum = sensorReadings.get(0).getValue();
        for(int i = 0; i < sensorReadings.size(); i++)
        {
            float number = sensorReadings.get(i).getValue();
            if(number < minimum)
                minimum = number;
        }
        minimum = Math.round(minimum * 10.0f / 10.0f);
        return minimum;
    }

    public float maxReading() {
        float maximum = sensorReadings.get(0).getValue();
        for(int i = 0; i < sensorReadings.size(); i++) {
            float number = sensorReadings.get(i).getValue();
            if (number > maximum)
                maximum = number;
        }
        maximum = Math.round(maximum * 10.0f / 10.0f);
        return maximum;
        }


    public float avgReading() {
        float total = 0;
        float avg = 0;
        for (int i = 0; i < sensorReadings.size(); i++) {
            total += sensorReadings.get(i).getValue();
            avg = total / sensorReadings.size();
        }
        avg = Math.round(avg * 10.0f / 10.0f);
        return avg;
    }
    }
