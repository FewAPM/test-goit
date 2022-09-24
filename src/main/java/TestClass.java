import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class TestClass {

    public int[] removePrice(int[] prices, int toRemove) {
         int counter = 0;
        for (int i = 0; i < prices.length; i++) {
            if (toRemove != prices[i]) {
                counter++;
            }
        }
        if (counter == 0) {
            return new int[0];
        }
        int [] arrForReturn = new int[prices.length];
        ArrayList<Integer> fuck = new ArrayList<>();
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] != toRemove) {
                fuck.add(prices[i]);
            }
        }

    int [] ssss = new int[counter];
        for (int i = 0; i < counter; i++) {
            ssss[i] = fuck.get(i);
        }
        return ssss;
    }

        public static void main(String[] args) {
            System.out.println(Arrays.toString(new TestClass().removePrice(new int[] {6, 0, 5, 9, 5, 7, 9, 0, 7, 0}, 0)));




            }

    }

