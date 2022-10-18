package moduleSeven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

class StringByteWorker{
    public String process(byte[] bytes){
        String str = new String(bytes);
        return str.toLowerCase();
    }
}

class ShortWordCounter{
    public int count(String phrase, int minLength){
        int counter = 0;
        String [] str = phrase.split(" ");
        for (String element: str) {

            if (element.length() <= minLength) {
                counter++;
            }
        }
        return counter;
    }
}