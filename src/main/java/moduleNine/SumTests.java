package moduleNine;

import java.util.ArrayList;

public class SumTests {


    public static void main(String[] args) {
        System.out.println("sum(5.2f + 3.2) = " + (int) Math.round(sum(5.2f, 3.4)));
        ArrayList<String> names = new ArrayList<>();

    }


    public static <T extends Number> double sum(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }
}
