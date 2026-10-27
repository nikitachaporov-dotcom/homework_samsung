package Dz1_8;

import java.util.Scanner;

public class Num9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        boolean[] a = new boolean[n + 1];
        for (int i = 0; i < n - 1; i++) {
            int card = scanner.nextInt();
            a[card] = true;
        }

        for (int i = 1; i <= n; i++) {
            if (!a[i]) {
                System.out.println(i);
                break;
            }
        }
    }
}
