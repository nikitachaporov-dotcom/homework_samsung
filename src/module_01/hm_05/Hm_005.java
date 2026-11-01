package module_01.hm_05;

import java.util.Scanner;

public class Hm_005 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int dig1 = input.nextInt();
        int dig2 = input.nextInt();
        int dig3 = input.nextInt();
        int dig4 = input.nextInt();


        boolean preRes1 = checkDigitals(dig1, dig2, dig3, dig4);
        boolean preRes2 = checkDigitals(dig2, dig1, dig3, dig4);

        System.out.println(preRes1 || preRes2);
    }
    public static boolean checkDigitals(int checkDig,int dig1, int dig2, int dig3){
        boolean res1;
        res1 = checkDig == -(dig1);
        boolean temp1 = res1 ? true : false;

        res1 = checkDig == -(dig2);
        boolean temp2 = res1 ? true : false;

        res1 = checkDig == -(dig3);
        boolean temp3 = res1 ? true : false;

        return temp1 || temp2 || temp3 ;
    }
}
