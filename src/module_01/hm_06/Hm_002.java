package module_01.hm_06;

import java.util.Scanner;

public class Hm_002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        if (x < y) {
            if (y < z) {
                System.out.println(x + " " + y + " " + z);
            } else if (x < z) {
                System.out.println(x + " " + z + " " + y);
            } else {
                System.out.println(z + " " + x + " " + y);
            }
        } else {
            if (x < z) {
                System.out.println(y + " " + x + " " + z);
            } else if (y < z) {
                System.out.println(y + " " + z + " " + x);
            } else {
                System.out.println(z + " " + y + " " + x);
            }
        }
    }
}
