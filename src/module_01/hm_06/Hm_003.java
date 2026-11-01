package module_01.hm_06;

import java.util.Scanner;

public class Hm_003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        String ending;

        int lastTwo = n % 100;
        int lastOne = n % 10;

        if (lastTwo >= 11 && lastTwo <= 14) {
            ending = "TORTOV";
        } else if (lastOne == 1) {
            ending = "TORT";
        } else if (lastOne >= 2 && lastOne <= 4) {
            ending = "TORTA";
        } else {
            ending = "TORTOV";
        }

        System.out.println(n + " " + ending);
    }
}
