package moduleSeven;

import java.util.ArrayList;
import java.util.Arrays;

class Phrase{
    private final String[] words;
    StringBuilder wordsElements = new StringBuilder();
    public Phrase (String[] words){
        this.words = words;
        for(String c: words){
          wordsElements.append(c).append(' ');
        }
    }
    @Override
    public String toString(){
        return wordsElements.toString();
    }
}

