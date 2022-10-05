package SpaceShip;

public class SpaceRocketLauncher{
    private int bigRocketCount;
    private int smallRocketCount;

    public void setSmallRocketCount(int smallRocketCount) {
        if (smallRocketCount < 0 || smallRocketCount > 100) {
            return;
        }
        this.smallRocketCount = smallRocketCount;
    }

    public int getSmallRocketCount(){
        return this.smallRocketCount;
    }
    public int getBigRocketCount(){
        return this.bigRocketCount;
    }

    public void setBigRocketCount(int bigRocketCount) {
        if (bigRocketCount < 0 || bigRocketCount > 100) {
            return;
        }
        this.bigRocketCount = bigRocketCount;
    }
    public void launchBigRocket(){
        if (bigRocketCount > 0) {
            bigRocketCount--;
            System.out.println("Launch big rocket");
        }
        return;
    }
    public void launchSmallRocket(){
        if (smallRocketCount > 0) {
            smallRocketCount--;
            System.out.println("Launch small rocket");
        }
        return;
    }

    public int getTotalPower(){
        return (bigRocketCount * 100) + (smallRocketCount * 50);
    }

    @Override
    public String toString() {
        return "SpaceRocketLauncher{" +
                "bigRocketCount=" + bigRocketCount +
                ", smallRocketCount=" + smallRocketCount +
                '}';
    }
}
class SpaceUtils{

    public static final int PLANET_COUNT = 8;
    public static final String HOME_PLANET_NAME = "Earth";
    public static final String HOME_STAR_NAME = "Sun";

    public static final String pluralPlanets(int planetCount){
             if (planetCount == 1) {
            return  "1 planet";
        }
            return  "" + planetCount + " planets";


    }
}

