package moduleSix;

public class AvgDamageCalculator {
    public int calculateAvg(int[] samples) {
        int sum = 0;

        try {
            for (int sampleValue: samples) {
                sum += sampleValue;
            }

            return sum / samples.length;
        } catch (ArithmeticException e) {
            return sum;
        }

        }




    public void printElement(int[] array, int index) {
        try {
            System.out.println("value is " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("wrong index");
        } finally {
            System.out.println("index is " + index);
        }

    }

    public static void main(String[] args) {
        System.out.println(new AvgDamageCalculator().calculateAvg(new int[0]));
    }
}

