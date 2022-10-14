import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        int sum = 2751;

        int amount = 0;
        while (sum > 0) {
            amount += sum % 10;
            sum = sum / 10;
        }
        System.out.println("amount = " + amount);

    }
}
