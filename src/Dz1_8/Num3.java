package Dz1_8;

import java.util.Scanner;

public class Num3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        float res = 0;
        int counter = 0;

        for (int i = 0; i < n;i++){
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 1 || arr[i] % 2 == -1){
                res += arr[i];
                counter += 1;
            }
        }
        if (counter > 0){
            res /= counter;
        }

        System.out.printf(counter == 0 ? "NO" : "%.2f", res);
    }
}