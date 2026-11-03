package module_01.hm_09;

public class Hm_003 {
    public static int sumOfThirteen(int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            int temp = i;
            int sum = 0;
            while (temp > 0) {
                sum = sum + temp % 10;
                temp = temp / 10;
            }
            if (sum % 13 == 0) {
                count++;
            }
        }
        return count;
    }
}