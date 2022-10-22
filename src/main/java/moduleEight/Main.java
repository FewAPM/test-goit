package moduleEight;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        WordDeleter wordDeleter = new WordDeleter();
        String[] fred = new String[]{"zawofu fgdg hgjf", "zime", "ycly", "vys", "yhypno"};
        String m = wordDeleter.parse(fred);
        System.out.println(m);

        //Hello
        //System.out.println(wordDeleter.remove("Hello Java", new String[]{"Java"}));

        //This Sparta
        //System.out.println(wordDeleter.remove("This is Sparta", new String[]{"is"}));


//         ЭТОГО ВАРИАНТА не было в описаниии
        //System.out.println(wordDeleter.remove("xiefbidyd yhypno zime ycly mynopybi vys zawofu", new String[]{"zawofu", "zime", "ycly", "vys", "yhypno"}));
    }
}

class WordDeleter {
    public String remove(String phrase, String[] words) {
        String[] phrases = phrase.split(" ");
        String withoutWords = "";
        for (int i = 0; i < phrases.length; i++) {
            boolean removing = false;
            for (int j = 0; j < words.length; j++) {
                if (phrases[i].equals(words[j]))
                    removing = true;
            }
            if (removing == false)
                withoutWords += " " + phrases[i];
        }
        return withoutWords.strip();
    }

    public String parse(String[] names) {
        String result = "";
        for (int i = 0; i < names.length; i++) {
            String[] tmp = names[i].split(" ");
            // names[i].split(" ") возвращякт масив
            String firstName = names[i].split(" ")[0];// тут ты берешь только 0 ячейку масива а их может быть больше
            System.out.println("Chto est v masive " + Arrays.toString(tmp) + "  - eto iterator - " + i + " dlina masiva " + tmp.length);
            result += firstName;
            if (i != names.length - 1) {
                result += ", ";
            }
        }

        return result;
    }
}
