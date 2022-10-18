package moduleSeven;


class PalindromeCounter{
    public int count(String phrase){
        String [] str = phrase.toLowerCase().split(" ");
        int i = 0;
        int counter = 0;
        for (String s: str){

            if   ((i = new StringBuilder(s).reverse().compareTo(new StringBuilder(s))) == 0) {
                counter++;
            }

        }
        return counter;
    }
}
class PalindromeCounterTest {
    public static void main(String[] args) {
        PalindromeCounter counter = new PalindromeCounter();

        //1
        System.out.println(counter.count("Level done!"));

        //0
        System.out.println(counter.count("No palindromes"));
    }
}