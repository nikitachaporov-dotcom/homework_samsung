package module_01.hm_07;

import java.util.Scanner;

public class Hm_003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalSum = 0;

        while (sc.hasNextInt()) {
            int number = sc.nextInt();

            if (number >= 10 && number <= 99) {
                totalSum += (number / 10) + (number % 10);
            } else {
                break;
            }
        }

        System.out.print(totalSum);
    }
}
