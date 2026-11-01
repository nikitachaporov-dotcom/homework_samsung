package module_01.hm_05;

import java.util.Scanner;

public class Hm_015 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        
        boolean test1 = (x * x + y * y <= 1);
        boolean test2 = (x >= 0);
        boolean test3 = (y >= 0);
        boolean test4 = (x <= 1);
        boolean test5 = (y <= 1);
        
        System.out.println((test1 || (test2 && test3 && test4 && test5)) ? "YES" : "NO");
    }
}
