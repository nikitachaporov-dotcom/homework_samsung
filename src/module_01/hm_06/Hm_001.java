package module_01.hm_06;

import java.util.Scanner;

public class Hm_001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = scanner.nextInt();

        if (num >= 0 && num <= 9) {
            System.out.println("DIGIT");
        } else if (num >= 10 && num <= 99) {
            System.out.println("NUM");
        } else {
            System.out.println("OTHER");
        }
    }
}
