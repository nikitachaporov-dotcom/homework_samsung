package module_01.hm_05;

import java.util.Scanner;

public class Hm_010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        boolean test1 = x * x - 2 <= y;
        boolean test2 = y <= x || y <= -x;

        System.out.println(test1 && test2  ? "YES" : "NO");
    }
}
