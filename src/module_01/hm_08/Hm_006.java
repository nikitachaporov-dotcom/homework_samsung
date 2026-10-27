package module_01.hm_08;

import java.util.Scanner;
public class Hm_006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int popular = a[0];
        int maxCount = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (a[j] == a[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                popular = a[i];
            }
        }
        System.out.println(popular);
    }
}
