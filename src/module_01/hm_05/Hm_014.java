package module_01.hm_05;

import java.util.Scanner;

public class Hm_014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        boolean test1 = (x >= 0) && (x * x + y * y <= 1);
        boolean test2 = (x >= 1) && (y <= 1) && (y >= x - 1);

        System.out.println(test2 || test1 ? "YES" : "NO");
    }
}
