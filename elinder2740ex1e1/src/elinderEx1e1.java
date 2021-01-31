import javax.swing.JOptionPane;
import java.text.NumberFormat;
import java.util.Locale;

public class elinderEx1e1 {
    public static void main(String[] args) {
        String city = JOptionPane.showInputDialog("Enter your city: ");
        String strPopulation = JOptionPane.showInputDialog("Enter your city population: ");
        int population = Integer.parseInt(strPopulation);

        ;
        //convert str population to a int using Integer.parseInt()
        String strSalesTaxRate = JOptionPane.showInputDialog("Enter your city sales tax rate: ");
        double salesTaxRate = Double.parseDouble(strSalesTaxRate);
        // convert strSalesTaxRate to double using Double.parseDouble()
        showLength(city);
        showUpperCase(city);
        showLower(city);
         showFirstChar(city);
        showPopulation(population);
        showSalesTaxRate(salesTaxRate);

        sampOperators();
    }

    public static void showLength(String s){
        JOptionPane.showMessageDialog( null, "Count of characters in " +
                s + " : " + s.length());
    }

    public static void showUpperCase(String s){
        JOptionPane.showMessageDialog(null, "Upper Case: "
         + " " + s.toUpperCase());
    }

    public static void showLower(String s){
        JOptionPane.showMessageDialog(null, "Lower Case: " +
         " " + s.toLowerCase());
    }

    public static void showFirstChar(String s){
        JOptionPane.showMessageDialog(null, "First Character:  "
                + s.charAt(0));
    }

    //use integer.tostring() to convert p to an integer
    public static void showPopulation(int p){
        JOptionPane.showMessageDialog(null, "Population: " +
                " " + p);
    }

    public static void showSalesTaxRate(double t){
        NumberFormat percent = NumberFormat.getPercentInstance();
        JOptionPane.showMessageDialog(null, "Sales Tax Rate: " +
                percent.format(t/100));
    }

    public static void sampOperators()
    {
        int i = 5, j = 4, k = 2;
        double d = 2.0;
        boolean t = true, f = false;
        char c = 'A', sp = 32;
        JOptionPane.showMessageDialog(null,
                "1) i / k = " + i / k + '\n' +		// System cannot display type double.
                        "2) i / d = " + i / d + '\n' +		// System can apply type double because it was declared in "d"
                        "3) c++ = " + c++ + '\n' +		// Operator is applied last
                        "4) ++c = " + ++c + '\n' +		// Operator is applied first
                        "5) c + sp = '" + c + sp + "'\n" +	// sp adds a space after the quotes('').
                        "6) (c + sp) = " + (c + sp) + '\n' +	// Order of operations because of ()
                        "7) (c += sp) = " + (c += sp) + '\n' +	// += makes C lowercase
                        "8) (i > j) && (j > k) = " + (((i > j) && (j > k)) ? "true" : "false") + '\n' +
                        // both i > j and (j > k) is true making it true
                        "9) (i < j) && (j > k) = " + (((i < j) && (j > k)) ? "true" : "false") + '\n' +
                        // i < j is false making it all false
                        "10) (i < j) || (j > k) = " + (((i < j) || (j > k)) ? "true" : "false") + '\n' +
                        // i < j is false until reaching || j > k which is true
                        "11) i + j / k = " + (i + j / k) + '\n' +	// First it takes 4/2 then it adds 5
                        "12) j / k + i = " + (j / k + i) + '\n' +	// Order of operations j/k then + i
                        "13) j / (k + i) = " + (j / (k + i)) + '\n' +	// result is always 0
                        "14) f && t || t = " + ((f && t || t) ? "true" : "false") + '\n' +
                        // f && t is false until || t making it true
                        "15) 100001000 - 100000900 = " + (100001000 - 100000900) + '\n' +
                        // simple subtraction problem, without floating points
                        "16) 100001000f - 100000900f = " + (100001000f - 100000900f) + '\n' +
                        // system is replacing 100 with 104.0 because of the floating point
                        "17) 1.000001f - 1.0000009f = " + (1.000001f - 1.0000009f) );
                       // system is replacing 1.000001f - 1.0000009f with 0.0f because of Float
    }


}
