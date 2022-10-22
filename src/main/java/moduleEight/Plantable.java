package moduleEight;

interface Plantable {
    void plant();

}

class Apple implements Plantable {
    private String name;

public Apple(String name){
    this.name = name;
}

    public String getName() {
        return name;
    }

    public void plant() {
        System.out.println("Plant  "  + name);
    }
}

class Garden {
    public void addPlant(Plantable plant) {
        plant.plant();
    }
}

class GardenTest {
    public static void main(String[] args) {
       System.out.println(new Garden()); //Plant apple
        new Garden().addPlant(new Apple("apple"));
    }
}