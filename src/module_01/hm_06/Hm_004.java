package module_01.hm_06;

import java.util.Scanner;

public class Hm_004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a == 0) {
            if (b > 0) {
                System.out.println("any x");
            } else {
                System.out.println("no such x");
            }
        } else {
            double bound = (double) -b / a;

            if (a > 0) {
                if (bound < 0) {
                    System.out.println("any x");
                } else {
                    System.out.printf("x<%.1f or x>%.1f\n", -bound, bound);
                }
            } else {
                if (bound <= 0) {
                    System.out.println("no such x");
                } else {
                    System.out.printf("%.1f<x<%.1f\n", -bound, bound);
                }
            }
        }
    }
}
