package moduleSix;

public class Point{
    private int x, y, z;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y &&
                z == point.z;
    }

    @Override
    public int hashCode() {
        return this.x + this.y + this.z;
    }


}
class StarTrack {
    private Point start;
    private Point finish;

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getFinish() {
        return finish;
    }

    public void setFinish(Point finish) {
        this.finish = finish;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StarTrack starTrack = (StarTrack) o;

        if (!start.equals(starTrack.start)) return false;
        return finish.equals(starTrack.finish);
    }

    @Override
    public int hashCode() {
        int result = start.hashCode();
        result = 31 * result + finish.hashCode();
        return result;
    }
}
