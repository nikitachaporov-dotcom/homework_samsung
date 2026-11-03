package module_01.hm_07;

import java.util.Scanner;

public class Hm_004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res1 = 0;
        int res2 = 0;
        int delimoe = sc.nextInt();
        int delitel = sc.nextInt();
        int ostatok = delimoe;

        while (ostatok >= delitel) {
            ostatok -= delitel;
            res1 ++;
        }
        res2 = ostatok;

        System.out.print(res1 + " " + res2);
    }
}
