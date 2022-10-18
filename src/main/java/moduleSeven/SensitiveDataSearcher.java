package moduleSeven;

class SensitiveDataSearcherTest {
    public static void main(String[] args) {
        SensitiveDataSearcher searcher = new SensitiveDataSearcher();

        //false
        System.out.println(searcher.isSensitiveDataPresent("Hello world"));

        //true
        System.out.println(searcher.isSensitiveDataPresent("Pass: swordfish"));
    }
}
class  SensitiveDataSearcher{
    public boolean isSensitiveDataPresent(String phrase){
        String [] strings = new String[] { "pass", "key", "login", "email"};
        phrase += phrase.toLowerCase();
        for (int i = 0; i < strings.length; i++) {
            if (phrase.contains(strings[i])) {
                return  true;
            }
        }
        return false;
    }


}
