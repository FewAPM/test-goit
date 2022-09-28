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
    public String drawRect(int width, int height, char c){
        String result = "";
        int w = height;
        while (w > 0) {
            w--;
            int h = width;
            while (h > 0) {
                h--;
                result += c;
            }
            result += '\n';
        }
        return result;
    }
    public String drawLine(int length){
//        int line = 0;
//        int counter = 1;
//        String str = "";
//        while (line < length) {
//
//            str += '*';
//            line++;
//            if (line == length) {
//                break;
//            }
//            counter = 0;
//
//            while (counter < 1) {
//                str += '#';
//                counter++;
//                line++;
//            }
//
//        }
        String str = "";
        boolean isTrue = true;
        while (length > 0) {
         str += isTrue? '*' : '#';
            isTrue = !isTrue;
            length--;
        }
        return str;
    }

    public static void main(String[] args) {
       // System.out.println(new TestClass().drawQuad(5));
        //System.out.println(new TestClass().drawRect(5, 6, 'X'));
        System.out.println(new TestClass().drawLine(11));
    }

}

