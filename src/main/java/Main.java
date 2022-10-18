import java.util.ArrayList;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        int counter = 1;
        int sum = 0;
        int [][] a = new int[4][3];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] =  counter++;
                System.out.print( " " + a[i][j]);
                sum += a[i][j];
            }
            System.out.println();
        }
        System.out.println("sum = " + sum);
    }

}