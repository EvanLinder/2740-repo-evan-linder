package business;

import java.time.LocalDateTime;

public class SensorReading {
    private int sensorReadingId;
    private int sensorId;
    private LocalDateTime dateTime;
    private float value;

    public SensorReading(int sensorReadingId, int sensorId, float value) {
        this.sensorReadingId = sensorReadingId;
        this.sensorId = sensorId;
        this.value = value;
        this.dateTime = LocalDateTime.now();
    }

    public int getSensorReadingId() {
        return sensorReadingId;
    }

    public int getSensorId() {
        return sensorId;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public float getValue() {
        return value;
    }
}
