package OOP;

import java.util.Arrays;
import java.util.Objects;

public class Main {


    public static void main(String[] args) {
        int [] arr1 = new int[]{0,1,2,3};
        int [] arr2 = new int[]{4,5,6,7,8,9};
        int [] sum = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            sum[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            sum[arr1.length + i] = arr2[i];
        }
        System.out.println("sum[arr1.length] = " + sum[arr1.length]);
        System.out.println("sum = " + Arrays.toString(sum));
        System.out.println((45+45)/2);
    }






}

