package moduleSeven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class DigitExtracterTest {
    public static void main(String[] args) {
        DigitExtracter digitExtracter = new DigitExtracter();

        int[] extracted = digitExtracter.extract("april 5, year 2000");

        //[5, 2, 0, 0, 0]
        System.out.println(Arrays.toString(extracted));
    }
}
class DigitExtracter{
    public int[] extract(String text){
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))){
                numbers.add(Integer.parseInt(String.valueOf(text.charAt(i))));
            }
        }
         Integer[] temp = numbers.toArray(new Integer[0]);
            int [] arrToReturn = new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            arrToReturn[i] = temp[i];
        }
        return arrToReturn;
    }
}