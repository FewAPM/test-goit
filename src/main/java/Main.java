import java.util.Arrays;

public class Main {
    // This is from my PC :)
    public String[] mergeStocks(String[] showcaseStocks, String[] warehouseStocks) {
        if (showcaseStocks.length == 0 & warehouseStocks.length == 0) {
            return new String [0];
        }
        int counter = 0;
        String [] result = new String [showcaseStocks.length + warehouseStocks.length];
        for (String element: showcaseStocks) {
            result[counter] = element;
            counter++;
        }
        for (String element: warehouseStocks) {
            result[counter] = element;
            counter++;
        }
        return result;
    }
    public static void main(String[] args) {


    }
}
