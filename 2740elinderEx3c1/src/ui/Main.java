package ui;

import Business.Sensor;
import Business.Values;

public class Main {
    public static void main(String args[]) {
    Values values = new Values();

    System.out.print("Total = \t\t" + values.calcTotal());
        System.out.print("Min values = \t\t" + values.calcMin());
        System.out.print("Max values = \t\t" + values.calcMax());
        System.out.print("Average value = \t\t" + values.calcAvg());

        Sensor sensor1 = new Sensor(1, 1,"Air register");

        sensor1.addSensorReading(75.2f);
        sensor1.addSensorReading(73.4f);
        sensor1.addSensorReading(75.2f);
        sensor1.addSensorReading(73.4f);
        sensor1.addSensorReading(75.2f);
        sensor1.addSensorReading(73.4f);
        sensor1.addSensorReading(75.2f);
        sensor1.addSensorReading(73.4f);
        sensor1.addSensorReading(71.6f);
        sensor1.addSensorReading(73.4f);
        sensor1.addSensorReading(71.6f);
        sensor1.addSensorReading(73.4f);
        sensor1.addSensorReading(71.6f);
        sensor1.addSensorReading(73.4f);
        sensor1.addSensorReading(71.6f);
        sensor1.addSensorReading(73.4f);
        sensor1.addSensorReading(75.2f);
        sensor1.addSensorReading(77f);
        sensor1.addSensorReading(78.8f);
        sensor1.addSensorReading(80.6f);
        sensor1.addSensorReading(82.4f);
        sensor1.addSensorReading(84.2f);
        sensor1.addSensorReading(82.4f);
        sensor1.addSensorReading(84.2f);
        sensor1.addSensorReading(82.4f);
        sensor1.addSensorReading(84.2f);
        sensor1.addSensorReading(86f);
        sensor1.addSensorReading(87.8f);
        sensor1.addSensorReading(86f);
        sensor1.addSensorReading(84.2f);
        sensor1.addSensorReading(82.4f);
        sensor1.addSensorReading(80.6f);
        sensor1.addSensorReading(82.4f);
        sensor1.addSensorReading(80.6f);
        sensor1.addSensorReading(82.4f);
        sensor1.addSensorReading(80.6f);
        sensor1.addSensorReading(82.4f);
        sensor1.addSensorReading(80.6f);
        sensor1.addSensorReading(78.8f);
        sensor1.addSensorReading(77f);
        sensor1.addSensorReading(78.8f);
        sensor1.addSensorReading(77f);
        sensor1.addSensorReading(75.2f);
        sensor1.addSensorReading(77f);
        sensor1.addSensorReading(75.2f);
        sensor1.addSensorReading(73.4f);
        sensor1.addSensorReading(75.2f);
        sensor1.addSensorReading(73.4f);
        sensor1.addSensorReading(75.2f);
        sensor1.addSensorReading(73.4f);
    }

}

