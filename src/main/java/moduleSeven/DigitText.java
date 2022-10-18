package moduleSeven;

class DigitTextTest {
    public static void main(String[] args) {
        //true
        System.out.println(new DigitText().detect("23 50"));

        //false
        System.out.println(new DigitText().detect("Year 1990"));
    }
}
class DigitText{
    public boolean detect(String text) {
        String alphabet = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
        String [] bet = alphabet.split(" ");
        text += text.toLowerCase();
        for (int i = 0; i < bet.length; i++) {
            if (text.contains(bet[i])) {
                return  true;
            }
        }
        return false;

    }
}