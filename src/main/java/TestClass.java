import java.util.Scanner;

public class TestClass {

    public void printPrices(float[] prices) {
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i] + " jup.");

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String country;

    int i = scanner.nextInt();
    switch (i){
        case 1:
        case 2:
        case 5:
            country = "Spain";
            break;
        case 3:
        case 7:
        country = "Germany";
            break;
        case 12:
        case 15:
        case 20:
            country = "GB";
            break;
        default:
            country = "Unknown";
    }
        System.out.println(country);
    }
}
