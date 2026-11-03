package module_01.hm_07;

import java.util.Scanner;

public class Hm_009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = 9;

        while (n > 0) {
            int digit = n % 10;
            if (digit != 0 && digit < min){
                min = digit;
            }
            n /= 10;
        }
        System.out.print(min);
    }
}
