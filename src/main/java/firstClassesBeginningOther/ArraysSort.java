package firstClassesBeginningOther;

import java.util.Arrays;

public class ArraysSort {
    public static void main(String[] args) {
        int [] arr = {11, 3, 14, 16, 7};
        int buf;
        boolean isTrue = false;

        while(!isTrue) {
            isTrue = true;
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] > arr[i+1]) {
                    isTrue = false;
                    buf = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
