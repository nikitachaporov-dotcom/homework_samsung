package module_01.hm_02;

import java.util.Scanner;

public class Hm_001 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int digital = input.nextInt();
        System.out.print(digital % 10);

        input.close();
    }
}
