package module_01.hm_02;

import java.util.Scanner;

public class Hm_002 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int digitals = input.nextInt();
        int digital1 = digitals / 100;
        int digital2 = (digitals / 10) % 10;
        int digital3 = digitals % 10;
        
        input.close();

        System.out.print(digital1 + digital2 + digital3);
    }
}
