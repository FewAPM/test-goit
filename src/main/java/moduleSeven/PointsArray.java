package moduleSeven;

public class PointsArray {
    int [] points;
    int index = 0;
    public PointsArray (int [] points) {
        this.points = points;

    }
    public int getX(int index){
        return points[index * 2];
    }

    public int getY(int index){
        return points[index * 2 + 1];
    }

    public static void main(String[] args) {
        int [] points = {5, 10, 15, 20, 25, 30};
        PointsArray p = new PointsArray(points);
        System.out.println("p.getX() = " + p.getX(2));
        System.out.println("p.getY(1) = " + p.getY(2));
    }
}
