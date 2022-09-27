import java.util.Arrays;

public class ChaepStocks {


        public String getCheapStocks(String[] stocks) {
            String result = "";
            String toSplit = "";
            for (String element: stocks){
                toSplit = toSplit + " " + element;
            }
            String [] arrSplitted = toSplit.split(" ");
            for (int i = 2; i < arrSplitted.length; i+=2) {
                if (Integer.parseInt(arrSplitted[i]) < 200) {
                    result = result + " " + arrSplitted[i-1];
                }

            }
            return result;
        }

    public static void main(String[] args) {
        System.out.println(new ChaepStocks().getCheapStocks(new String[]{"gun 500", "firebow 70", "pixboom 200"}));
    }
    }

