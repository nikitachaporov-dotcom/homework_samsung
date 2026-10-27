package Dz1_8;

import java.util.Scanner;
import java.util.ArrayList;

public class Num7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        ArrayList<Integer> left = new ArrayList<>(); // я что-бы упростить решеение решил применить Array listы
        ArrayList<Integer> right = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            int inp = scanner.nextInt();
            if (inp < 0) {
                left.add(inp);
            } else {
                right.add(inp);
            }
        }
        left.addAll(right);
        for (int num : left) {
            System.out.print(num + " ");
        }
    }
}