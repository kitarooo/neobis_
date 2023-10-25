package week1;

import java.util.Scanner;

public class Banknotes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (n > 0) {
            int[] balance = {100, 50, 20, 10, 5, 2, 1};
            System.out.println(n);
            for (int i : balance) {
                System.out.println(n / i + " nota(s) de R$ " + i + " ,00");
                n = n % i;
            }
        }
    }
}
