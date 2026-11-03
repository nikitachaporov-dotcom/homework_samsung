package module_01.hm_09;

public class Hm_001 {
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }
}