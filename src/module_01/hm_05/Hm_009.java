package module_01.hm_05;

import java.util.Scanner;

public class Hm_009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        boolean test1 = 2 - x * x >= y;
        boolean test2 = y > x;
        boolean test3 = 2 - x * x >= y && y < x && y > 0;
        
        System.out.println((test1 && test2) || test3 ? "YES" : "NO");
    }
}
