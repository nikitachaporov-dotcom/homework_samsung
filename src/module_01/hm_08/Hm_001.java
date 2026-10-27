package module_01.hm_08;

import java.util.Scanner;

public class Hm_001 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int res = 0;

        for (int i = 0; i < n;i++){
            arr[i] = sc.nextInt();
        }

        int find = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == find) {
                res = i + 1;
                break;
            }
        }
        System.out.println(res == 0 ? "NO" : res);
    }
}