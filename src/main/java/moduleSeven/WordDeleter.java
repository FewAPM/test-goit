package moduleSeven;
import java.util.ArrayList;
import java.util.Arrays;
class WordDeleter{
        public String remove(String phrase, String[] words) {
        String [] phrases = phrase.split(" ");
            String withoutWords = "";
            int length = words.length;
            int counter= 0;
            int  iter = 0;

            if (words.length == 1) {
                for (int i = 0; i < words.length; i++) {
                    for (int j = 0; j < phrases.length; j++) {
                        if (!phrases[j].equals(words[i])) {
                            withoutWords += phrases[j] + " ";
                        }
                    }
                }
            } else {
                while (length > 0) {
                    for (int i = 0; i < words.length; i++) {
                        if (phrases[iter].equals(words[i])) {
                            counter++;
                        }
                    }
                    if (counter == 0) {
                        withoutWords += phrases[iter] + " ";
                        phrases[iter] = "";
                    }
                    iter++;
                    counter = 0;
                    length--;
                }
            }
            return withoutWords.strip();
        }
    }

class WordDeleterTest {
    public static void main(String[] args) {
        WordDeleter wordDeleter = new WordDeleter();

        //Hello
       System.out.println(wordDeleter.remove("Hello Java", new String[] {"Java"}));

        //This Sparta
       System.out.println(wordDeleter.remove("This is Sparta", new String[] {"is"}));

        System.out.println(wordDeleter.remove("xiefbidyd yhypno zime ycly mynopybi vys zawofu", new String[] {"zawofu", "zime", "ycly", "vys", "yhypno"}));
    }
}
