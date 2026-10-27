package Dz1_8;

import java.util.Scanner;
public class Num10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] a = new int[n][n];
        int current = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = current++;
            }
        }                           //Надеюсь ничего страшного, что я двумерные массива использовал

        current = 1;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                if (a[i][j] == current) {
                    System.out.print(current + " ");
                }
                current++;
            }
        }
    }
}
