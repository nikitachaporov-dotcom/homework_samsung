package Dz1_8;

import java.util.Scanner;

public class Num4 {
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