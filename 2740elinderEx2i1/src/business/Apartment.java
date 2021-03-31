package business;

import java.time.LocalDateTime;

public class Apartment {
    private int apartmentId;
    private String apartmentNum;
    private int squareFeet;
    private int bathrooms;
    private double price;
    private LocalDateTime updated;
    private Person administrator;
    private Person renter;

    public Apartment() {
        this.apartmentId = 0;
        this.apartmentNum = "";
        this.squareFeet = 0;
        this.bathrooms = 0;
        this.price = 0.0;
        this.updated = LocalDateTime.now();
        this.administrator = null;
        this.renter = null;
    }

//    public Apartment(int apartmentId, String location, String apartmentNum, int squareFeet, int bathrooms, double price) {
//        this.apartmentId = apartmentId;
//        this.apartmentNum = apartmentNum;
//        this.squareFeet = squareFeet;
//        this.bathrooms = bathrooms;
//        this.price = price;
//        this.updated = LocalDateTime.now();
//    }

    public int getApartmentId() { return this.apartmentId; }
    public String getApartmentNum() { return this.apartmentNum; }
    public int getSquareFeet() { return this.squareFeet; }
    public int getBathrooms() { return this.bathrooms; }
    public double getPrice() { return this.price; }
    public LocalDateTime getUpdated() { return this.updated; }
    public Person getAdministrator() {return administrator;}
    public Person getRenter() {return renter;}

    public String setApartmentId(int apartmentId) {
        String errMsg = "";
        if (apartmentId >= 100 && apartmentId <= 199)
            this.apartmentId = apartmentId;
        else
            errMsg = Integer.toString(apartmentId) + " is invalid. ApartmentId must be >= 101 and <= 199";
        return errMsg;
    }

    public String setApartmentNum(String apartmentNum) {
        String errMsg = "";
        if (apartmentNum == "" || apartmentNum == null) {
            errMsg = "ApartmentNum is required";
            return errMsg;
        }
        if (apartmentNum.length() < 1 || apartmentNum.length() > 4) {
            errMsg = "ApartmentNum must be 1 to 4 characters";
            return errMsg;
        }
        this.apartmentNum = apartmentNum;
        return errMsg;
    }


    public String setSquareFeet(int squareFeet) {
        String errMsg = "";
        if (squareFeet >= 200 && squareFeet <= 2000)
        {this.squareFeet = squareFeet;}
else
        {errMsg = Integer.toString(squareFeet) + " is invalid. Square feet must be > 200 and < 2000.";}

        return errMsg;
    }

    public String setBathrooms(int bathrooms) {
        String errMsg = "";
        if (bathrooms <= 0 || bathrooms >= 4)
            {
                errMsg = Integer.toString(bathrooms) + " is invalid. Bathrooms must be > 0 and < 4.";
                return errMsg;
            }
        this.bathrooms= bathrooms;
        return errMsg;

    }

        public void setPrice() {
            double ratePerSqFoot = 0.0;
            if (this.squareFeet >= 1000)
                ratePerSqFoot = 1.0;
            else if (this.squareFeet >= 600)
                ratePerSqFoot = 1.2;
            else if (this.squareFeet >= 400)
                ratePerSqFoot = 1.4;
            else if (this.squareFeet >= 200)
                ratePerSqFoot = 1.6;
            {

               this.price = this.squareFeet * ratePerSqFoot;
               this.price += (bathrooms - 1) * 100;

            }

    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }

    public void setAdministrator(Person administrator) {this.administrator = administrator;}

    public void setRenter(Person renter) {this.renter = renter;}

    @Override
    public String toString() {
        return "Apartment:\n" +
                "\tApartment Id=\t" + this.apartmentId +
                "\n\tApartment#=\t\t" + this.apartmentNum +
                "\n\tSquare Feet=\t" + this.squareFeet +
                "\n\tBathrooms=\t\t" + this.bathrooms +
                "\n\tPrice=\t\t\t" + this.price +
                "\n\tUpdated=\t\t" + this.updated +
                "\n";
    }
}