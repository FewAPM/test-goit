package OOP;

public class Animal {
    public int paws = 4;

    public Animal() {
        System.out.println("Parent constructor block");
        howManyPaws();
    }
    public void howManyPaws(){
        System.out.println("Parent method");
        System.out.println(paws);

    }
}
class Cat extends Animal{
    private static int paws = 4;

   public Cat(){
       System.out.println("Child Cat constructor block");

    }

    @Override
    public void howManyPaws() {
        System.out.println("This child method");
        System.out.println(paws);
    }
}
class AnimamlTest{
    public static void main(String[] args) {
        new Cat();
    }
}
