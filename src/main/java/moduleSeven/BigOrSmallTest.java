package moduleSeven;

class BigOrSmallTest {
    public static void main(String[] args) {
        //Small
        System.out.println(new BigOrSmall().calculate("Java"));

        //Big
        System.out.println(new BigOrSmall().calculate("JAVA"));

        //Same
        System.out.println(new BigOrSmall().calculate("jAvA"));
    }
}
class BigOrSmall{
    public String calculate(String text){
        int lowCounter = 0;
        int uppCounter = 0;
        String result = "";
        String upperTextCase = text.toUpperCase();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == upperTextCase.charAt(i)) {
                uppCounter++;
            } else {
                lowCounter++;
            }
        }
        if (lowCounter > uppCounter) {
            result = "Small";
        } else if (lowCounter < uppCounter) {
            result = "Big";
        } else {
            result = "Same";
        }
        return result;
    }
}