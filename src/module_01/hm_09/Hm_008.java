package module_01.hm_09;

public class Hm_008 {
    public static int min(int a, int b, int c, int d) {
        int minVal = a;
        if (b < minVal) {
            minVal = b;
        }
        if (c < minVal) {
            minVal = c;
        }
        if (d < minVal) {
            minVal = d;
        }
        return minVal;
    }
}