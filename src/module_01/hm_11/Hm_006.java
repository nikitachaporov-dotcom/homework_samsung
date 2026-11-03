package module_01.hm_11;

import java.util.Scanner;

public class Hm_006 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int size = 2 * n + 1;
        int[][] a = new int[size][size];

        int num = 0;
        int r = n;
        int c = n;
        a[r][c] = num;

        int step = 1;
        while (step < size) {

            for (int i = 0; i < step; i++) {
                r--;
                num++;
                a[r][c] = num;
            }

            for (int i = 0; i < step; i++) {
                c--;
                num++;
                a[r][c] = num;
            }
            step++;

            if (step == size) {
                break;
            }                           //Выглядит страшно, но решается просто


            for (int i = 0; i < step; i++) {
                r++;
                num++;
                a[r][c] = num;
            }

            for (int i = 0; i < step; i++) {
                c++;
                num++;
                a[r][c] = num;
            }
            step++;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%3d", a[i][j]);
            }
            System.out.println();
        }
    }
}