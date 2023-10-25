package week1;

import java.util.Scanner;

public class TriangleTypes {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);

        double a = numbers.nextDouble();
        double b = numbers.nextDouble();
        double c = numbers.nextDouble();

        if (a >= b + c) {
            System.out.println("NAO FORMA TRIANGULO");
        }
        if ((a * a) == (b * b) + (c *c)) {
            System.out.println("TRIANGULO RETANGULO");
        }
        if ((a * a) > (b * b) + (c *c)) {
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        if ((a * a) < (b * b) + (c *c)) {
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if (a == b && b == c && c == a) {
            System.out.println("TRIANGULO EQUILATERO");
        }

        if(a == b && c != a || c == a && b != c || c == b && c != a) {
            System.out.println("TRIANGULO ISOSCELES");
        }
    }
}
