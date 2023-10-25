package week1;

import java.util.Scanner;

public class Grenais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int left;
        int right;

        int Inter = 0;
        int Gremio = 0;
        int Empates = 0;

        int repeat;
        int grenais = 0;
        while (true) {

            left = scanner.nextInt();
            right = scanner.nextInt();
            System.out.println("Novo grenal (1-sim 2-nao)");

            if(left < right) {
                Gremio++;
            } else if (left == right) {
                Empates++;
            } else if (left > right)
                Inter++;
            grenais++;
            if (scanner.nextInt()==2)break;
        }

        if (Inter > Gremio) {
            System.out.println(grenais + " grenais " + "\n" + "Inter: " + Inter + "\n" + "Gremio: " + Gremio + "\n" + "Empates: " + Empates + "\n" + "Inter venceu mais");
        } else {
            System.out.println("Inter: " + Inter + "\n" + "Gremio: " + Gremio + "\n" + "Empates: " + Empates + "\n" + "Gremio venceu mais");
        }
    }
}
