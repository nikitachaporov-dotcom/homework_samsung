package module_01.hm_05;

import java.util.Scanner;

public class Hm_012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        boolean test1 = x * x + y * y <= 1;
        boolean test2 = y > x;
        boolean test3 = y < -x;
        System.out.println(test1 && !(test2 && test3)  ? "YES" : "NO");
    }
}
