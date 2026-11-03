package module_01.hm_04;

import java.util.Scanner;

public class Hm_006 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int res = n & (n - 1);

        System.out.println(res);
    }
}