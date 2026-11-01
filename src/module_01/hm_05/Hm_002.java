package module_01.hm_05;

import java.util.Scanner;

public class Hm_002 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float in = input.nextFloat();

        System.out.println(((in >= -3) && (in <= 5)) || (((in >= 8) && (in <= 15))));
    }
}
