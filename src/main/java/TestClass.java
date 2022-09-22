public class TestClass {
    public void print(String s){
        System.out.println("s");
    }

    public int sum (int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
    new TestClass().print("It is rather difficult for me :(");
        new TestClass().sum(132156,6655);
    }
}
