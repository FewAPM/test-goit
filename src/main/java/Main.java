import java.util.Arrays;

public class Main {
    // This is from my PC :)
    public void printFirst(){
        System.out.println("My first method");
    }
    public void printSecond(){
        System.out.println("My second method");
    }
    public static void main(String[] args) {

        int [] a = new int[] {1, 99, 5, 49};
          int  index = 0;
        for (int element: a) {
            if ((element % 10) == 9) {
                index++;
            }
        }
        int k = 0;
        int [] result = new int[a.length-index];
        for (int element: a) {
            if ((element % 10) == 9) {
                result[k] = element;
                k++;
            }
        }

        System.out.println(Arrays.toString(result));

    }
}
