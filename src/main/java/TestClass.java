import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class TestClass {

        public static void main(String[] args) {
           // System.out.println(Arrays.toString(new TestClass().removePrice(new int[] {6, 0, 5, 9, 5, 7, 9, 0, 7, 0}, 0)));
            int [] arr = new int[100];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i;
            }
            int low = arr[0];
            int high = arr[arr.length-1];
            int mid = (low + high) / 2;
            System.out.println(mid);
            System.out.println(mid/2);

            boolean b = 20 > 10;
            System.out.println(b);
            }
    }

