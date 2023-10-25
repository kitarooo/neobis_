package week1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class WeightedAverages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 2;
        int b = 3;
        int c = 5;

        for (int i = 0; i < n; i++) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            double z = sc.nextDouble();

            double result = (((x * a) + (y * b) + (z * c)) / (a + b + c));
            System.out.println("\n" + result);
        }
    }
}
