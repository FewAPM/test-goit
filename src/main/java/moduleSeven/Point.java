package moduleSeven;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point add (Point other){
        return new Point (this.x + other.x,  this.y + other.y);
    }

    public Point sub(Point other){
        return new Point(x - other.x, y - other.y);
    }

    public Point multiply(Point other){
        return new  Point(x * other.x, y * other.y);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public static Point of (int x, int y){
        return new Point(x,y);
    }
}
