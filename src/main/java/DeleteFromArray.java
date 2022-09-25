import java.util.Arrays;

public class DeleteFromArray {
    public int[] removePrice(int[] prices, int toRemove) {
        int toRemoveCount = 0;
        for(int price: prices) {
            if (price == toRemove) {
                toRemoveCount++;
            }
        }

        int[] result = new int[prices.length - toRemoveCount];
        int index = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] != toRemove) {
                result[index] = prices[i];
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new TestClass().removePrice(new int[] {6, 0, 5, 9, 5, 7, 9, 0, 7, 0}, 0)));

    }
}
