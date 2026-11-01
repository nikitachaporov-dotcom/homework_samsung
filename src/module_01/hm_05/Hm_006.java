package module_01.hm_05;

import java.util.Scanner;

public class Hm_006 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int dig1 = input.nextInt();
        int dig2 = input.nextInt();
        int dig3 = input.nextInt();

        boolean dig1Ev;
        boolean dig2Ev;
        boolean dig3Ev;

        dig1Ev = dig1 % 2 == 0;
        dig2Ev = dig1 % 2 == 0;
        dig3Ev = dig1 % 2 == 0;

        boolean preRes1 =  dig1Ev || dig2Ev;
        boolean preRes2 = dig2Ev || dig3Ev;

        System.out.println(preRes1 && preRes2);
    }
}
