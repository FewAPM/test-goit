public class Recursion {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(new Recursion().sumQuads(3));
    }
    public static int factorial(int number) {
        if(number == 0 || number == 1) {
            return 1;
        }
        int result = number * factorial(number-1);
        return result;
    }

    public int sumQuads(int n) {
        int result  = 0;
        if(n == 0 || n == 1) {
            return 1;
        }
        while (n > 0) {

            result += (n * n) ;
            n--;
        }
        return result;
    }
}
