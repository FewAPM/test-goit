package OOP;

class RectangleAreaUtil{
    private int [] arr = new int [4];
    public RectangleAreaUtil(int[] coords){
        arr[0] = coords[0];
        arr[1] = coords[1];
        arr[2] = coords[2];
        arr[3] = coords[3];
    }
    public int getArea(){
        return ((Math.abs(arr[2] - arr[0])) * (Math.abs(arr[3] - arr[1])));
    }
}