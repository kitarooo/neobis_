package week1;

import java.util.Random;
import java.util.Scanner;

public class ColumnInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[12][12];
        int column = input.nextInt();
        String str = input.next();
        double sum = 0;
        String summ = "S";
        String average = "A";
        //matrix = fill(12,12);

        if (column >= 0 && column <= 11) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[i][j] = input.nextDouble();
                    if (column == j) {
                        sum += matrix[i][j];
                    }
                }
            }

            /*for(int i = 0; i<matrix[column].length;i++){

            }*/
            if (summ.equals(str)) {
                System.out.println(sum);
            } else if (average.equals(str)) {
                System.out.println(sum / 12);
            }
        }
    }

    /*public static double[][] fill(int row, int column) {
        double[][] ret = new double[row][column];
        Random rnd = new Random();
        for (int i = 0; i < ret.length; i++) {
            for (int j = 0; j < ret.length; j++) {
                ret[i][j] = (double) rnd.nextInt(100);
            }
        }


        return ret;
    }*/
}
