package OOP;

import java.util.Objects;

public class Main {

    public Main(){

        System.out.println("Hi there!");
    }

    public int divide(int a, int b) {
        int result = 0;
        try {
            System.out.println("Try block");
            System.out.println(a/b);
            result = a/b;
        } catch (ArithmeticException e) {
            System.out.println("It is forbidden to divide by 0");
        } finally {
            System.out.println("Print all the time");
        }
        return result;
    }

    public static void main(String[] args) {
        new Main().divide(15,0);
    }

}

