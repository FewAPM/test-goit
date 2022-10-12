package OOP;

class Rocket {
    {
        System.out.println("3 usual Parent block");
    }
    static {
        System.out.println("1 Parent static block");
    }
    public Rocket() {
        System.out.println("4 Parent constructor");
    }


}

class RocketLauncher {
    public static void main(String[] args) {
        new ChildRocket();
    }
}
class ChildRocket extends Rocket{
    static {
        System.out.println(" 2 Child static block");
    }
    {
        System.out.println("5 usual Parent block");
    }
    public ChildRocket(){
        System.out.println("6 Child constructor");
    }

}