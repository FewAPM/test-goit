import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class TestClass {

        public String drawQuad(int n) {
            int columns = n;
            String result = "";
        while (columns > 0) {
            columns --;
            int rows = n;
            while (rows > 0) {
                result += '*';
                rows--;
            }
            result += '\n';
        }

            return result;

        }

    public static void main(String[] args) {
        System.out.println(new TestClass().drawQuad(5));
    }

}

