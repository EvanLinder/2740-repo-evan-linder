package db;

import business.Apartment;

import java.io.*;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.util.List;

public class ApartmentTextFile {
   // List<Apartment> apartments = null;
    Path apartmentsPath = null;
    File apartmentsFile = null;
    private final String FIELD_SEP = "\t";

    public ApartmentTextFile() {
        this.apartmentsPath = Paths.get("2740elinderEx3d1\\apartments.txt");
        this.apartmentsFile = apartmentsPath.toFile();
    }

    public int saveAll(List<Apartment> apartments) {

        int count = 0;
        try (PrintWriter out = new PrintWriter(new BufferedWriter(
                new FileWriter(this.apartmentsFile)))) {
            for (Apartment apt : apartments) {
                out.println("ApartmentId: " +Integer.toString(apt.getApartmentId()) + FIELD_SEP);
                out.println("ApartmentNum: " + apt.getApartmentNum() + FIELD_SEP);
                out.println("SquareFt: " + Integer.toString(apt.getSquareFeet()) + FIELD_SEP);
                out.println("Bathrooms: " +Integer.toString(apt.getBathrooms()) + FIELD_SEP);
                out.println("Price: " + Double.toString(apt.getPrice()) + FIELD_SEP);
                out.println("Updated: " +apt.getUpdated() + FIELD_SEP);
            }
            count = apartments.size();
        } catch (IOException e) {
            System.out.println(e);
        }
        return count;
    }

    public List<Apartment> getAll(List<Apartment> apartments) {
        if (Files.exists(this.apartmentsPath)) {
            try (BufferedReader in = new BufferedReader(
                    new FileReader(this.apartmentsFile))) {
                String line  = in.readLine();
                String[] fields = line.split(FIELD_SEP);
              //  System.out.println(line);
              //  System.out.println(fields[0] + " " + fields[1] + " " + fields[2]);
                if (line != null) {
                    int apartmentId = Integer.parseInt(fields[0]);
                    String apartmentNum = (fields[1]);
                    int squareFeet = Integer.parseInt(fields[2]);
                    int bathrooms = Integer.parseInt(fields[3]);
                    double price = Double.parseDouble(fields[4]);
                    LocalDateTime updated = LocalDateTime.parse(fields[5]);
                    apartments.add(new Apartment(apartmentId, apartmentNum, squareFeet, bathrooms, price, updated));
                }
            }
            catch (IOException e) {
                System.out.println(e);
                return null;
            }
        }
        else {
            System.out.println(this.apartmentsPath.toAbsolutePath() + " doesn't exist.");
            return null;
        }
        return apartments;
    }


}

