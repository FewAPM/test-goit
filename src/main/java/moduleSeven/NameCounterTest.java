package moduleSeven;

class NameCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new NameCounter().count("Mars is great planet"));

        //2
        System.out.println(new NameCounter().count("Moon is near Earth"));

        //0
        System.out.println(new NameCounter().count("SPACE IS GREAT"));
    }
}
class NameCounter{

    public int count(String text) {
        int nameCounter = 0;
        String [] words  = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= 2) {
                if (Character.isUpperCase(words[i].charAt(0))) {
                    if (Character.isLowerCase(words[i].charAt(1))) {
                        nameCounter++;
                    }

                }
            }
        }
        return nameCounter;
    }
}