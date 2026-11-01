package module_01.hm_02;

import java.util.Scanner;

public class Hm_003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        int nextEven = n + 2 - n % 2;
        
        input.close();
        System.out.println(nextEven);
    }
}
