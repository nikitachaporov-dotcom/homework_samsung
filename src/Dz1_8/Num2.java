package Dz1_8;

import java.util.Scanner;

public class Num2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int res = 0;
        boolean flag = true;

        for (int i = 0; i < n;i++){
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0){
                res += arr[i];
                flag = false;
            }
        }


        System.out.println(flag ? "NO" : res);
    }
}