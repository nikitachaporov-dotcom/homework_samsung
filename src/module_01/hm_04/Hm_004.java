package module_01.hm_04;

import java.util.Scanner;

public class Hm_004 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int i = in.nextInt();

        int mask = 1 << i;
        a = a ^ mask;

        System.out.println(a);
    }
}