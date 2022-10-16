package moduleSeven;

import java.util.Arrays;

public class GooTest {
    public static void main(String[] args) {
//        System.out.println(new GooSearchResult("http://mountain.alps.com/resorts").parseDomain());
//       String[] words = {"alpha", "beta", "gamma"};
//        System.out.println(new Phrase(words));
       // String [] phrase = {"Rivyf", "Iwwy", "Ehpyzaoqqy"};
        String phrase = "Kupocysam Teqoh Saboyxvysa";
        System.out.println(Arrays.toString(new WordSplitter().split(phrase)));
        System.out.println("[kupocysam, teqoh, saboyxvysa]");
    }
}
