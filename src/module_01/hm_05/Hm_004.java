package module_01.hm_05;

import java.util.Scanner;

public class Hm_004 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int in = input.nextInt();
        boolean test1 = in / 100 >= 1;
        boolean test2 = in % 5 == 0;
        boolean test3 = in > 0;

        System.out.println(test1 && test2 && test3);
    }
}
