package module_01.hm_07;

import java.util.Scanner;

public class Hm_001 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int counter = 0;

        while (true){
            int digit = sc.nextInt();
            counter++;

            if (digit < 0){
                break;
            }
        }

        System.out.print(counter);
    }
}
