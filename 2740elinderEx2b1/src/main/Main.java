package main;

import java.text.NumberFormat;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args){
        Building building1 = new Building();
        building1.setBuildingId(101);
        building1.setAddress ("105 W Mark Street");
        building1.setCity("Winona");
        building1.setState("Minnesota");
        building1.setZip(56025);
        building1.setUnits(5);
        building1.setUpdated(LocalDateTime.now());

        Building building2 = new Building(102, "105 W Mark Street", "Winona", "Minnesota", 56025, 5);

        SensorReading sr1 = new SensorReading();
        sr1.setSensorReadingId(1001);
        sr1.setSensorId(101);
        sr1.setReadingDateTime(LocalDateTime.now());
        sr1.setTemperature(70.0);

        SensorReading sr2 = new SensorReading(1002, 102, 68.0);
        SensorReading sr3 = new SensorReading(1003, 103, 71.0);
        SensorReading sr4 = new SensorReading(1004, 104, 67.0);
        SensorReading sr5 = new SensorReading(1005, 105, 72.0);
        SensorReading sr6 = new SensorReading(1006, 106, 66.0);
        SensorReading sr7 = new SensorReading(1007, 107, 73.0);
        SensorReading sr8 = new SensorReading(1008, 108, 65.0);




       System.out.println(building1.toString());
       System.out.println(building2.toString());

       System.out.println(sr1.toString());
        System.out.println(sr2.toString());
        System.out.println(sr3.toString());
        System.out.println(sr4.toString());
        System.out.println(sr5.toString());
        System.out.println(sr6.toString());
        System.out.println(sr7.toString());
        System.out.println(sr8.toString());
    }
}
