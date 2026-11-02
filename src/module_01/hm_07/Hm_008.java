package module_01.hm_07;

import java.util.Scanner;

public class Hm_008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;

        while (n > 0) {
            int digit = n % 10;

            if (digit % 2 != 0) {
                System.out.print(digit);
                flag = true;
                break;
            }

            n /= 10;
        }

        if (!flag) {
            System.out.print("NO");
        }
    }
}
