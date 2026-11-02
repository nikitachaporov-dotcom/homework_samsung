package module_01.hm_07;

import java.util.Scanner;

public class Hm_010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = n + 1;

        while (true) {
            if (isPrime(res)) {
                System.out.print(res);      // C этой задачей мне помогло ии (я просто вообще не знал как сделать, а если и делал,
                //то не проходил тест по времени)
                break;
            }
            res++;
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
