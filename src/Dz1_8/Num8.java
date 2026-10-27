package Dz1_8;

import java.util.Scanner;

public class Num8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n  = scanner.nextInt();

        if (n == 0) {
            System.out.print(0);
            return;
        }

        while (n > 0) {
            System.out.print(n % 2);
            n /= 2;
            }

    }
}
