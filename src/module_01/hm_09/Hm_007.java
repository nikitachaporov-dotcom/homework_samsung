package module_01.hm_09;

public class Hm_007 {
    public static double segmentLength(int x1, int y1, int x2, int y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static double trianglePerimetr(int x1, int y1, int x2, int y2, int x3, int y3) {
        double a = segmentLength(x1, y1, x2, y2);
        double b = segmentLength(x2, y2, x3, y3);
        double c = segmentLength(x3, y3, x1, y1);
        return a + b + c;
    }
}