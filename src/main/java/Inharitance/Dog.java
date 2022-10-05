package Inharitance;

public class Dog extends Animal{
    public void  bark(){
        System.out.println("bark");
    }

    @Override
    public void eat() {
        System.out.println("Eating dog's food");
    }
}
