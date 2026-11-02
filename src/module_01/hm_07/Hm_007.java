package module_01.hm_07;

import java.util.Scanner;

public class Hm_007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        while (n > 0) {
            n /= 10;
            count++;
        }

        System.out.print(count);
    }
}
