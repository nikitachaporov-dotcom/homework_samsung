package module_01.hm_08;

import java.util.Scanner;
public class Hm_015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
