package moduleEight;

interface Flyable {
    void fly();
}

class Rocket implements Flyable {
    public void fly() {
        System.out.println("Fly, rocket, fly!");
    }
}