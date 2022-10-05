package Inharitance;

public class Cat extends Animal {

    public void mew(){
        System.out.println("Mew-mew!");
    }
    @Override
    public void eat() {
        super.eat();
        System.out.println("Eating cat's food");
    }
}
