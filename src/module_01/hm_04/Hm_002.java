package module_01.hm_04;

import java.util.Scanner;

public class Hm_002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();


            int result = 1 << n;

            System.out.println(result);
        }
    }
}
