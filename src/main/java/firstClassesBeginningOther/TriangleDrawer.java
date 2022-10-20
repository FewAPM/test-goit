package firstClassesBeginningOther;

public class TriangleDrawer {

    public String drawTriangle(int side) {
        String str = "";
        int width = side;
    while (side > 0) {
    side--;
    while (width > 0) {
        str += '*';
        width--;
    }
    width = side;
    str += '\n';
    }
    return str;
    }

    public static void main(String[] args) {
        System.out.println(new TriangleDrawer().drawTriangle(3));
    }
}
