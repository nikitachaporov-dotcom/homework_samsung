package module_01.hm_04;

import java.util.Scanner;

public class Hm_001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int i = scanner.nextInt();


        if (i >= 32) {
            System.out.println(0);
            }
        else {
            int result = (a >> i) << i;
            System.out.println(result);
        }
    }
}
