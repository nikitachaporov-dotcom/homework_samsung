package module_01.hm_07;

import java.util.Scanner;

public class Hm_011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            int bridgeHeight = sc.nextInt();

            if (bridgeHeight <= 437) {
                System.out.print("Crash " + i);
                return;
            }
        }

        System.out.print("No crash");
    }
}
