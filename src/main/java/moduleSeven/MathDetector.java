package moduleSeven;

import java.util.Arrays;

class MathDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new MathDetector().isMath("2+2=4"));

        //false
        System.out.println(new MathDetector().isMath("1992 is great year"));

        //false
        System.out.println(new MathDetector().isMath("Venus vs Earth"));
    }
}
class MathDetector {
    public boolean isMath(String text) {
        boolean first = false;
        boolean second = false;
        boolean third = false;
        int counter = 0;
        int[] a = new int[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 60};
        byte[] bytes = text.getBytes();

        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] == 42 || bytes[i] == 45 | bytes[i] == 47 || bytes[i] == 43) {
                first = true;
            }
        }
        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] == 61) {
                second = true;
            }

        }
        for (int j = 0; j < bytes.length; j++) {
            for (int k = 0; k < a.length; k++) {
                if (bytes[j] == a[k]) {
                    counter++;

                }
            }
        }

        if (counter > 1) {
            third = true;
        }
        return first && second && third;
    }
}


