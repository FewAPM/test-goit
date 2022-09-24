import java.util.Arrays;
import java.util.Scanner;

public class TestClass {

    public int getMinPriceCount(int[] prices){

        int counter = 0;
        int buf;
        if (prices.length == 0) {
            return counter;
        }
        for (int i = 0; i < prices.length-1; i++) {
            for (int j = 0; j < prices.length-i-1; j++) {
                if (prices[j] > prices[j+1]) {
                    buf = prices[j];
                    prices[j] = prices[j+1];
                    prices[j+1] = buf;
                }
            }

        }
            int min = prices[0];
            for (int element: prices) {
                if (element == min) {
                    counter++;
                }
            }
        return counter;
        }




        public static void main(String[] args) {
            System.out.println(new TestClass().getMinPriceCount(new int[] {5, 10, 15, 3, 5}));



    }
}
