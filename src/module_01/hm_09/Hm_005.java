package module_01.hm_09;

public class Hm_005 {
    public static double avgOf4Digit(int[] arr) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num >= 1000 && num <= 9999) {
                sum = sum + num;
                count++;
            }
        }
        if (count == 0) {
            return -1;
        }
        return (double) sum / count;
    }
}