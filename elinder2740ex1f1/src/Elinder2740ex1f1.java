import javax.swing.JOptionPane;
import java.text.NumberFormat;

public class Elinder2740ex1f1 {
    public static void main(String args[]) {

displayWelcome();
String location = getLocation();
String ApartmentNumber1 = getApartmentNum();
int sqrFeet1 = getSquareFeet(ApartmentNumber1);
double getPrice1 = getPrice(ApartmentNumber1);

String aptNum2 = getApartmentNum();
int sqrFeet2 = getSquareFeet(aptNum2);
double price2 = getPrice(aptNum2);
displayApartment(location, ApartmentNumber1, sqrFeet1, getPrice1 );
displayTotals(sqrFeet1, sqrFeet2, getPrice1, price2);

    }
    public static void displayWelcome() {
        JOptionPane.showMessageDialog(null,
                "Evan Linder COMC2740 Ex1F1\nProperty Management");
    }

    public static String getLocation() {
        String loc= JOptionPane.showInputDialog("Building location");
        return loc;

    }

    public static String getApartmentNum(){
        String aptNum = JOptionPane.showInputDialog("Apartment Number");
        return aptNum;
    }

    public static int getSquareFeet(String aptNum) {
        String strSqrFeet = JOptionPane.showInputDialog("Square feet for Apt# " + aptNum);
        int sqrFeet = Integer.parseInt(strSqrFeet);
        return sqrFeet;
    }

    public static double getPrice(String aptNum){
        String strGetPrice = JOptionPane.showInputDialog("Price for apt# " + aptNum);
        double getPrice = Double.parseDouble(strGetPrice);
        return getPrice;
    }

    public static void displayApartment(String location, String aptNum, int sqrfeet, double price){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        JOptionPane.showMessageDialog(null,
                "Location: " + location + "\nApartment#: " + aptNum + "\nSqr Feet: " + sqrfeet + "\nApartment Price: " +
                        currency.format(price));
    }

    public static void displayTotals(int sqrFeet1, int sqrFeet2, double price1, double price2){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
       int totalSqrFeet = sqrFeet1 + sqrFeet2;
       double totalPrice = price1 + price2;
        JOptionPane.showMessageDialog(null, "Total square feet: " + totalSqrFeet
        + "\nTotal Price: " + currency.format(totalPrice));
    }
}
