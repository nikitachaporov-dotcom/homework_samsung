package module_01.hm_08;

import java.util.Scanner;

public class Hm_004 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = (3 * i) + 4;
        }

        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}