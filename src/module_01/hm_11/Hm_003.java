package module_01.hm_11;

import java.util.Scanner;

public class Hm_003 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
            }
        }

        boolean isSim = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] != a[j][i]) {
                    isSim = false;
                    break;
                }
            }
            if (!isSim) {
                break;
            }
        }

        if (isSim) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}