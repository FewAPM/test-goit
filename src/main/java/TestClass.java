import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class TestClass {

public String serialNumber;

    public  int fact(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        int f = number * fact (number-1);
            return f;
    }

    public static void main(String[] args) {
    TestClass test = new TestClass();

        long [] numbers = new long []{5,3,6};
        long [] multiply = Arrays.copyOf(numbers, numbers.length);
        int c = 0;
        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers.length; j++) {
                multiply[c] *= numbers[j];
            }
            c++;
        }

        System.out.println("Arrays.toString(multiply) = " + Arrays.toString(multiply));
        String str = "sdksffkjjjgjrigij";
        int len = str.length();
        System.out.println(len);
        boolean first = str.startsWith("sd");
        System.out.println("first = " + first);
    }

    public void setSerialNumber(String serialNumber) {
        if (serialNumber.length() != 8 || !serialNumber.startsWith("SN")) {
            return;
        }
        this.serialNumber = serialNumber;
    }

}

