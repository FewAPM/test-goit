import java.util.Arrays;
import java.util.Scanner;

public class TestClass {

    public int[] findMinMaxPrices(int[] prices){
        int min, max;
        int [] newArray = new int []{};
        if (prices.length == 0) {
            return newArray;
        } else {
            int temp;
            for (int i = 0; i < prices.length-1; i++) {
                if (prices[i] > prices[i+1]) {
                    temp = prices[i];
                    prices[i] = prices[i+1];
                    prices[i+1] = temp;
                }
            }
            min = prices[0];
            max = prices[prices.length-1];
            if (min == max) {
                return newArray = new int [] {min};
            }
            return newArray = new int [] {min, max};
        }
    }


        public static void main(String[] args) {
            System.out.println(Arrays.toString(new TestClass().findMinMaxPrices(new int[] {})));
        ;

    }
}
