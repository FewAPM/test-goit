package moduleSeven;

public class PointTester {
    public static void main(String[] args) {


        Point p1 = new Point(2, 2);
        Point p2 = new Point(5, 5);

        Point result = p1.add(p2).add(p2).sub(p1);
        System.out.println("result = " + result);

        result = Point.of(10,10)
                .add(Point.of(17,17)
                .sub(Point.of(1,1))
                .multiply(Point.of(3,3)));
        System.out.println("result = " + result);
//        result = p1.sub(p2);
//        System.out.println("result = " + result);
//        result = p1.multiply(p2);
//        System.out.println("result = " + result);
    }
}
