package module_01.hm_09;

public class Hm_002 {
    public static int sumOfSeven(int a, int b) {
        int sum = 0;

        for (int i = a; i <= b; i++) {
            if (i >= 10 && i <= 99) {
                if (i % 7 == 0) {
                    int temp = i;
                    while (temp > 0) {
                        sum = sum + temp % 10;
                        temp = temp / 10;
                    }
                }
            }
        }

        return sum;
    }
}