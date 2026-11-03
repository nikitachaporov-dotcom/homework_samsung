package module_01.hm_09;

public class Hm_006 {
    public static void minToBegin(int[] arr) {
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        int minVal = arr[minIndex];
        for (int i = minIndex; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = minVal;
    }
}