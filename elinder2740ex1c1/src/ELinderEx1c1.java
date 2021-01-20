import java.util.Scanner;

public class ELinderEx1c1 {
    public static void main(String[] args) {
        System.out.println("elinder2740ex1c: Renter Information\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Acct#:\t\t\t");
        int accountNum = sc.nextInt();
        System.out.print("First name:\t\t");
        String firstName = sc.next();
        System.out.print("Last name:\t\t");
        String lastName = sc.next();
        System.out.print("Monthly income:\t");
        int monthlyIncome = sc.nextInt();
        System.out.print("Rent:\t\t\t");
        int Rent = sc.nextInt();
        System.out.print("Electric:\t\t");
        int Electric = sc.nextInt();
        System.out.print("Gas:\t\t\t");
        int Gas = sc.nextInt();
        System.out.print("Cable:\t\t\t");
        int cable = sc.nextInt();

        double totalExpenses =  (Rent + Electric + Gas + cable);
        double leftMoney =  (monthlyIncome - totalExpenses);
        System.out.println("Account:\t" + accountNum + "\t" + firstName + "\t" + lastName);
        System.out.println("Income - expenses:\t" + "$" + monthlyIncome + " - $" +
                totalExpenses + " = $" + leftMoney);


    }
}