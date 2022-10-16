package moduleSeven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

class PunctuationMarkCounter{
    public int count(String phrase){
        char [] chars = phrase.toCharArray();
        int counter = 0;
        for (char c : chars) {
            if (c == '.' || c == ',' || c == '!' || c == ':' || c == ';') {
                counter++;
            }
        }
        return counter;
    }

}
class PunctuationMarkCounterTest {
    public static void main(String[] args) {
        PunctuationMarkCounter counter = new PunctuationMarkCounter();

        //2
        System.out.println(counter.count("Hello, world!"));

        //1
        System.out.println(counter.count("This is Sparta!"));

        //1
        System.out.println(counter.count("End."));
    }
}
class DoubleSpaceCleaner{
    public String clean(String phrase) {
        ArrayList<String> list = new ArrayList<>();
        String additionalStr = phrase.trim().strip();
        String correct = "";
        while (additionalStr.contains(" ")) {
            int index = additionalStr.indexOf(' ');
            String temp = additionalStr.substring(0, index);
            list.add(temp);
            additionalStr = additionalStr.replaceFirst(temp, "");
            additionalStr = additionalStr.trim().strip();

        }
        list.add(additionalStr);

        String[] splited = list.toArray(new String[0]);
        for (int i = 0; i < splited.length; i++) {
            correct += splited[i] + " ";
        }

        return  correct.strip();
    }
}
