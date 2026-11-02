package module_01.hm_07;

import java.util.Scanner;

public class Hm_005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = 0;
        int inp = sc.nextInt();
        int ostatok = inp;
        while (ostatok / 2 != 0) {
            ostatok /= 2;
            res ++;
        }

        System.out.print(res + 1);
    }
}
