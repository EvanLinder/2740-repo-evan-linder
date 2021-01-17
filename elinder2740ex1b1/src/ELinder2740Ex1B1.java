public class ELinder2740Ex1B1 {
    public static void main(String[] args){



        System.out.println("Customer: 101 Evan Linder");
        System.out.println("Thermometer#: 1001");


        int time1 = 0; int temperature1 = 60;
        int time2 = 10; int temperature2 = 70; int timeTemp1 = (time2 - time1) * temperature1;
        int time3 = 20; int temperature3 = 80; int timeTemp2 = (time3 - time2) * temperature2;
        int time4 = 30; int temperature4 = 44; int timeTemp3 = (time4 - time3) * temperature3;
        int time5 = 50; int temperature5 = 80; int timeTemp4 = (time5 - time4) * temperature4;

        double averageTemperature = (double) (timeTemp1 + timeTemp2 + timeTemp3 + timeTemp4) / time5;
        System.out.println ("Average temperature: " + averageTemperature);

    }
}
