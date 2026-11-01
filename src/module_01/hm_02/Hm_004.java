package module_01.hm_02;

import java.util.Scanner;

public class Hm_004 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        int k = input.nextInt();
        int n = input.nextInt();

        int cost = (r * 100 + k) * n;

        int rubli = cost / 100;
        int kopiki = cost % 100;
        System.out.println(rubli + " " + kopiki);

        input.close();
    }
}
