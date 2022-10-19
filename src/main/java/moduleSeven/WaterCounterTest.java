package moduleSeven;

class WaterCounterTest {
    public static void main(String[] args) {
        //0.07692307692307693
        System.out.println(new WaterCounter().count("Moon invaders"));

        //0
        System.out.println(new WaterCounter().count("NoWater"));
    }
}
class WaterCounter{
    public double count(String text){
        double waterCounter = 0;
        for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == ' ') {
                    waterCounter++;
                }
        }
        return waterCounter / text.length();
    }
}