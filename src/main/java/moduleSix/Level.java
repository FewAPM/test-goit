package moduleSix;

class Level {
    private int width;
    private int height;

    private int sum;

    public Level(int width, int height) {
        this.width = width;
        this.height = height;
        this.sum = width * height;

    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    public int getSum(){
        return  sum;
    }
}

class LevelLoader {
    public void load(Level level) throws LevelTooBigException{
        if ( level.getSum() > 100000) {throw new LevelTooBigException();}
        System.out.println("Level loaded");
    }
}

class LevelLoaderTest {
    public static void main(String[] args) {
        //Level loaded
        try {
            new LevelLoader().load(new Level(10, 20));
        } catch (LevelTooBigException ex) {
            System.out.println("Level too big");
        }

        //Level too big
        try {
            new LevelLoader().load(new Level(10000, 2000));
        } catch (LevelTooBigException ex) {
            System.out.println("Level too big");
        }
    }
}
class LevelTooBigException extends Exception {
    LevelTooBigException() {
        super("Level too big");

    }
}


