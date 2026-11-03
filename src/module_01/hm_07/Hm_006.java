package module_01.hm_07;

import java.util.Scanner;

public class Hm_006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
        int res = 0;

        for (int tekDigit = 26; tekDigit <= inp; tekDigit += 2) {
            res += tekDigit;
        }

        System.out.print(res);
    }
}
