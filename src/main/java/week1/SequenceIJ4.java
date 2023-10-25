package week1;

import java.text.DecimalFormat;

public class SequenceIJ4 {
    public static void main(String[] args) {
       for (double i = 0; i <= 2; i += 0.2) {
           System.out.println("I= " + parse(i) + "J=" + parse(i+1));
       }
    }

    private static String parse(double n) {
        if (n == (int) n) {
            return "" + (int) n;
        } else {
            return "" + n;
        }
    }
}
