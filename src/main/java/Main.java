import java.util.Arrays;

public class Main {
//    public int countBanknotes(int sum){
//       // int sum = 2750;
//        int sumOfDivides = 0;
//        int divideBy500 = 0;
//        int divideBy200 = 0;
//        int divideBy100 = 0;
//        int divideBy50 = 0;
//        int divideBy20 = 0;
//        int divideBy10 = 0;
//        int divideBy5 = 0;
//        int divideBy2 = 0;
//        int divideBy1 = 0;
//        if (sum == 500 | sum == 200 | sum == 100 | sum == 50 | sum == 20 | sum == 10 | sum == 5 | sum == 2 | sum == 1) {
//            sumOfDivides = 1;
//        } else if (sum > 500) {
//            divideBy500 = sum / 500;
//            sumOfDivides += divideBy500;
//            sum -= (500 * divideBy500);
//        }
//        else if (sum == 200) {
//            sumOfDivides += 1;
//            //break;
//            if (sum > 200) {
//                divideBy200 = sum /200;
//                sumOfDivides += divideBy200;
//                sum -= (200 * divideBy200);
//            }
//        }
//        else if (sum == 100) {
//            sumOfDivides += 1;
//            //break;
//            if (sum > 100) {
//                divideBy100 = sum /100;
//                sumOfDivides += divideBy100;
//                sum -= (100 * divideBy100);
//            }
//        }
//        else if (sum == 50) {
//            sumOfDivides += 1;
//            //break;
//            if (sum > 50) {
//                divideBy50 = sum /50;
//                sumOfDivides += divideBy50;
//                sum -= (50 * divideBy50);
//            }
//        }
//        else if (sum == 20) {
//            sumOfDivides += 1;
//            //break;
//            if (sum > 20) {
//                divideBy20 = sum /20;
//                sumOfDivides += divideBy20;
//                sum -= (20 * divideBy20);
//            }
//        }
//        else if (sum == 10) {
//            sumOfDivides += 1;
//            //break;
//            if (sum > 10) {
//                divideBy10 = sum /10;
//                sumOfDivides += divideBy10;
//                sum -= (10 * divideBy10);
//            }
//        }
//        else if (sum == 50) {
//            sumOfDivides += 1;
//            //break;
//            if (sum > 5) {
//                divideBy5 = sum /5;
//                sumOfDivides += divideBy5;
//                sum -= (5 * divideBy5);
//            }
//        }
//        else if (sum == 50) {
//            sumOfDivides += 1;
//            //break;
//            if (sum > 5) {
//                divideBy5 = sum /5;
//                sumOfDivides += divideBy5;
//                sum -= (5 * divideBy5);
//            }
//        }
//        else if (sum == 2) {
//            sumOfDivides += 1;
//            //break;
//            if (sum > 2) {
//                divideBy2 = sum /2;
//                sumOfDivides += divideBy2;
//                sum -= (2 * divideBy2);
//            }
//        }else if (sum == 1) {
//            sumOfDivides += 1;
//            if (sum > 1) {
//                divideBy1 = sum / 1;
//                sumOfDivides += divideBy1;
//                sum -= (1 * divideBy1);
//            }
//        }
//        return sumOfDivides;
 //   }

//    int n = 15624;
//    int sum = 0;
//        while (n > 0){
//        sum += n % 10;
//        n /=10;
//    }


    public static void main(String[] args) {
       // 500, 200, 100, 50, 20, 10, 5, 2, 1
        int sum = 288312;
        int amount = 0;
        amount += sum / 500;
        sum = sum % 500;

        amount += sum / 200;
        sum = sum % 200;

        amount += sum /100;
        sum = sum % 100;

        amount += sum /50;
        sum = sum % 50;

        amount += sum /20;
        sum = sum % 20;


        amount += sum /10;
        sum = sum % 10;

        amount += sum /5;
        sum = sum % 5;

        amount += sum /2;
        sum = sum % 2;

        amount += sum /1;
        sum = sum % 1;

    }




    }

