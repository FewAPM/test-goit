package moduleSeven;

import java.util.Arrays;
import java.util.Objects;

class WordFreqCounter{
    public float countFreq(String phrase, String word){
        String [] str = phrase.toLowerCase().split(" ");
        float counter = 0.0f;
        for(String s: str){
            if (Objects.equals(s, word.toLowerCase())) {
                counter++;
            }
        }
        System.out.println(Arrays.toString(str));
        System.out.println("counter = " + counter);
        return  counter/ str.length;
    }

}
class WordFreqCounterTester{

    public static void main(String[] args) {
        WordFreqCounter wfc = new WordFreqCounter();
        String phrase = "sycovab nylul Be ewp qyykuwi Be huakjefase umtimycu jon";
        String word = "Be";
        System.out.println(wfc.countFreq(phrase, word));

    }
}