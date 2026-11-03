package module_01.hm_04;

import java.util.Scanner;

public class Hm_005 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int i = in.nextInt();
        int mask = (1 << i) - 1;
        int result = a & mask;
        System.out.println(result);
    }
}