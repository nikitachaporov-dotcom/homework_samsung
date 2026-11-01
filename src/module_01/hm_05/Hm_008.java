package module_01.hm_05;

import java.util.Scanner;

public class Hm_008 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        
        boolean test1 = (y >= 0);
        boolean test2 = (y <= 0.5);
        boolean test3 = (y <= Math.sin(x));
        boolean test4 = (x >= 0);
        boolean test5 = (x <= Math.PI); // эту строчку мне написала нейронка(я просто не знал, почему не работает)
        
        System.out.println((test1 && test2 && test3 && test4 && test5) ? "YES" : "NO");
    }
}
