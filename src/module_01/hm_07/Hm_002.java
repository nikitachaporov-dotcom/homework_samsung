package module_01.hm_07;

import java.util.Scanner;

public class Hm_002 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int counter = 0;

        while (true){
            int digit = sc.nextInt();

            if (digit > 10){
                counter += digit;
            }

            if (digit % 5 == 0){
                break;
            }
        }

        System.out.print(counter);
    }
}
