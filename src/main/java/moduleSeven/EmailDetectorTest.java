package moduleSeven;

import java.util.Arrays;

class EmailDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new EmailDetector().isPresent("This email is no-reply@goo.com"));

        //false
        System.out.println(new EmailDetector().isPresent("No email present, but @ there"));


    }
}
class EmailDetector{
    public boolean isPresent(String text){
        byte [] bytes = text.getBytes();
        for (int i = 3; i < bytes.length-2; i++) {
                if (bytes[i] == 64) {
                    if (bytes[i-2] == 32 ||bytes[i-1] == 32 || bytes[i+1] == 32 || bytes[i+2] == 32) {
                        return false;
                    }
                    return true;
                    }
                }
        return false;
    }
}