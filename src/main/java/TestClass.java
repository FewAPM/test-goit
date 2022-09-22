import java.lang.reflect.Array;
import java.util.Arrays;

public class TestClass {


    public static void main(String[] args) {
        int row = 4;
        int column = 3;
        int counter = 1;
        int [][] array = new int[row][column];




        for (int i = 0; i < array.length; i++) {
            System.out.println("i " + i);
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(" j " + j);
                array[i][j] = counter++;
               // System.out.print(" " + array[i][j]);
            }
           // System.out.println();
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
           // System.out.println("i " + i);
            for (int j = 0; j < array[i].length; j++) {
                //System.out.println("j " + j);
                //array[i][j] = counter++;
                System.out.print(" " + array[i][j]);
            }
            System.out.println();
        }

//        for (int[] element: array) {
//            for (int innerElement: element) {
//                System.out.print(" ");
//                System.out.print( innerElement = counter ++);
//            }
//            System.out.println();
//        }

    }
}
