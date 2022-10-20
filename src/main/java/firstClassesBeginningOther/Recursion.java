package firstClassesBeginningOther;

public class Recursion {
    public static void main(String[] args) {
        //System.out.println(factorial(5));
        //System.out.println(new firstClassesBeginningOther.Recursion().sumQuads(3));
        Recursion r = new Recursion();

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

   // виклик new FirNumSum().calc(3) повертає 6


//    public int calc(int n) {
//
//        if (n == 0 || n == 1) {
//            return 1;
//        }
//        int factorial = 0;
//        factorial += n * calc(n-1);
//        return factorial;
//    }





}
