import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {
//        String s = "april 5, year 2000";
//        List<Integer> numbers = new ArrayList<>();
//        for (int i = 0; i < s.length(); i++) {
//            if (Character.isDigit(s.charAt(i))){
//                numbers.add(Integer.parseInt(String.valueOf(s.charAt(i))));
//
//            }
//
//        }
//
//        System.out.println("numbers = " + numbers);
        String s = "april 5, year 2000";
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))){
                numbers.add(Integer.parseInt(String.valueOf(s.charAt(i))));

            }

        }
        Integer[] arrayToReturn = numbers.toArray(new Integer[0]);
        System.out.println("Arrays.toString(arrayToReturn) = " + Arrays.toString(arrayToReturn));
    }

}