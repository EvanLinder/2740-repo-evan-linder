package main;

import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        String result = "";


        result = person1.setPersonId(100);
        if (!result.equals("")) System.out.println(result);
        result = person1.setPersonId(1000);
        if (!result.equals("")) System.out.println(result);
        result = person1.setPersonId(101);
        if (!result.equals("")) System.out.println(result);


       result = person1.setFirstName("Evan");
        if (!result.equals("")) System.out.println(result);
        result = person1.setFirstName("\nP");
        if (!result.equals("")) System.out.println(result);
        result = person1.setFirstName("TheBigBangTheory");
        if (!result.equals("")) System.out.println(result);

       result = person1.setLastName("Linder");
        if (!result.equals("")) System.out.println(result);
        result = person1.setLastName("\nL");
        if (!result.equals("")) System.out.println(result);
        result = person1.setLastName("TheBigBangTheoryRulesTheFaceOfTheEarth");
        if (!result.equals("")) System.out.println(result);

      result = person1.setUserName("evan.linder");
        if (!result.equals("")) System.out.println(result);
        result = person1.setUserName("\nL");
        if (!result.equals("")) System.out.println(result);
        result = person1.setUserName("TheBigBangTheoryRulesTheFaceOf.TheEarth");
        if (!result.equals("")) System.out.println(result);
        result = person1.setUserName("admin");
        if (!result.equals("")) System.out.println(result);
        result = person1.setUserName("administrator");
        if (!result.equals("")) System.out.println(result);
        result = person1.setUserName("supervisor");
        if (!result.equals("")) System.out.println(result);




        person1.setUpdated();


        System.out.println("\nPersonId: \t\t" + person1.getPersonId());
        System.out.println("First Name:\t\t" + person1.getFirstName());
        System.out.println("Last Name:\t\t" + person1.getLastName());
        System.out.println("User Name:\t\t" + person1.getUserName());
        System.out.println("Date Updated:\t" + person1.getUpdated());
        System.out.println();


//        System.out.println("PersonId: \t\t" + person2.getPersonId());
//        System.out.println("First Name:\t\t" + person2.getFirstName());
//        System.out.println("Last Name:\t\t" + person2.getLastName());
//        System.out.println("User Name:\t\t" + person2.getUserName());
//        System.out.println("Date Updated:\t" + person2.getUpdated());
//        System.out.println();

 /*       Apartment apartment1 = new Apartment();
        apartment1.setApartmentId(1001);
        apartment1.setLocation("Winona");
        apartment1.setApartmentNum(1);
        apartment1.setSquareFeet(2500);
        apartment1.setPrice(1200.00);
        apartment1.setUpdated();


        Apartment apartment2 = new Apartment(1002, "Winona", 2, 2500,
                1200.00);


        System.out.println(apartment1.toString());
        System.out.println(apartment2.toString());
        System.out.println();



        displayTotals(apartment1, apartment2);
    }*/
/*
        public static void displayTotals (Apartment apartment1, Apartment apartment2){
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            int totalFeet = apartment1.getSquareFeet() + apartment2.getSquareFeet();
            double totalRevenue = apartment1.getPrice() + apartment2.getPrice();
            System.out.println("Total Square Feet: " + totalFeet);
            System.out.println("Total monthly revenue: " + totalRevenue);
        }*/

    }
}
