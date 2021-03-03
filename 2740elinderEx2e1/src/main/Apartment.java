package main;
import java.time.LocalDateTime;

public class Apartment {
    private int apartmentId;
    private String location;
    private int apartmentNum;
    private int squareFeet;
    private double price;
    private LocalDateTime updated;

    public Apartment() {
        this.apartmentId = 0;
        this.location = "";
        this.apartmentNum = 0;
        this.squareFeet = 0;
        this.price = 0.0;
        this.updated = LocalDateTime.now();
    }

    public Apartment(int apartmentId, String location, int apartmentNum, int squareFeet, double price) {
        this.apartmentId = apartmentId;
        this.location = location;
        this.apartmentNum = apartmentNum;
        this.squareFeet = squareFeet;
        this.price = price;
        this.updated = LocalDateTime.now();

    }

    public int getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(int apartmentId) {
        this.apartmentId = apartmentId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getApartmentNum() {
        return apartmentNum;
    }

    public void setApartmentNum(int apartmentNum) {
        this.apartmentNum = apartmentNum;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(int squareFeet) {
        this.squareFeet = squareFeet;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated() {
      this.updated = updated;
    }

    @Override
    public String toString() {
        return "\n(Apartment " + apartmentNum + ")" +
                "\napartmentId=" + apartmentId +
                ", \nlocation='" + location + '\'' +
                ", \napartmentNum=" + apartmentNum +
                ", \nsquareFeet=" + squareFeet +
                ", \nprice=" + price +
                ", \nupdated=" + updated
                ;
    }
}
