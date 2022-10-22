package moduleEight;

enum Season {
    Summer,
    Autumn,
    Winter,
    Spring
}

enum Cars {
    Shkoda,
    Mitsubushi
}

class CarsFormatter{
//    public String getCarName(Cars cars){
//        return switch (cars) {
//            case Shkoda -> "Skoda";
//            case Mitsubushi -> "Mitsubishs";
//        };
//    }
}

class SeasonFormatter {
    public String getSeasonName(Season season) {
        return switch (season) {
            case Summer -> "Summer";
            case Autumn -> "Autumn";
            case Winter -> "Winter";
            case Spring -> "Spring";
        };

    }
}


enum Planet {
    Earth,
    Yarik,
    Marina,
    Mars;
}

class PlanetTest {
    public static void main(String[] args) {
        for(Planet planet: Planet.values()) {
            System.out.println(planet.name());
        }
        int index = Planet.Marina.ordinal();
        System.out.println("index = " + index);
    }

}