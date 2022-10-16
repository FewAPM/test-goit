package moduleSeven;

import java.math.BigDecimal;


public class PointTester {


    public String removeChar(String line, char c){
        char [] chars = line.toCharArray();
        int charCounter = 0;
        for (char lineChar: chars){
            if(lineChar != c) {
                charCounter++;
            }
        }
        return line;
    }
    public static void main(String[] args) {
//        byte [] message = {
//                76,
//                65,
//                86,
//                65
//        };
//        System.out.println("new String(message) = " + new String(message));

//        StringBuilder result = new StringBuilder();
//        long start = System.currentTimeMillis();
//        for (int i = 0; i < 10; i++) {
//            result.append(String.valueOf(i));
//            System.out.println("result = " + result);
//        }
//        System.out.println("result = " + result);
//        long end = System.currentTimeMillis();
//        System.out.println("end - start = " + (end - start));


//        BigDecimal first = new BigDecimal("0.3");
//        BigDecimal result = first.multiply(first);
//        System.out.println(result);

//        Point p1 = new Point(2, 2);
//        Point p2 = new Point(5, 5);
//
//        Point result = p1.add(p2).add(p2).sub(p1);
//        System.out.println("result = " + result);
//
//        result = Point.of(10,10)
//                .add(Point.of(17,17)
//                .sub(Point.of(1,1))
//                .multiply(Point.of(3,3)));
//        System.out.println("result = " + result);
////        result = p1.sub(p2);
////        System.out.println("result = " + result);
////        result = p1.multiply(p2);
////        System.out.println("result = " + result);
    }
}
