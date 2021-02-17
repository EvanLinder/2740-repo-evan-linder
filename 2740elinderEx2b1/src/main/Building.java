package main;

import java.time.LocalDateTime;

public class Building {
    private int buildingId;
    private String address;
    private String city;
    private String state;
    private int zip;
    private int units;
    private LocalDateTime updated;

    public Building() {
        this.buildingId = 0;
        this.address = "";
        this.city = "";
        this.state = "";
        this.zip = 0;
        this.units = 0;
        this.updated = LocalDateTime.now();
    }

    public Building(int buildingId, String address, String city, String state, int zip, int units) {
        this.buildingId = buildingId;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.units = units;
        this.updated = LocalDateTime.now();
    }

    public int getBuildingId() {
        return this.buildingId;
    }

    public void setBuildingId(int buildingId) {
        this.buildingId = buildingId;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return this.zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public int getUnits() {
        return this.units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public LocalDateTime getUpdated() {
        return this.updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }

    @Override
    public String toString() {
        return

                        "\nbuildingId=" + buildingId +
                        "\naddress=" + address +
                         "\ncity='" + city +
                        ", \nstate=" + state +
                         "\nzip=" + zip +
                         "\nunits=" + units +
                        "\nupdated=" + updated;

    }

}


