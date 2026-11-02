package module_01.hm_07;

import java.util.Scanner;

public class Hm_012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = 0;

        for (int i = 0; i < Math.abs(b); i++) { //abs нужен если b будет отрицательным
            res += (b < 0) ? -a : a;
        }

        System.out.print(res);
    }
}
