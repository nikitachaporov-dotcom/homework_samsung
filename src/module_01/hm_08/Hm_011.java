package module_01.hm_08;

import java.util.Scanner;
public class Hm_011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }

        System.out.println(f);
    }
}
