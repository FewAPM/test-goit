package firstClassesBeginningOther;

public class BinarySearch {
    static int counter = 0;

    private static int binarySearch(int elementForSearch){
        int [] array = new int[] { -10, -9, -7, -5,-4,0,1,2,3,4,5,6,10,11,23,25,26,28,29};
        int lowestIndex = 0;
        int highestIndex = array.length-1;


        while (lowestIndex <= highestIndex) {
            counter++;
            int midIndex = (lowestIndex + highestIndex) / 2;
            int midElement = array[midIndex];
            if (midElement < elementForSearch) {
                lowestIndex = midIndex +1;

            } else if (midElement > elementForSearch) {
                highestIndex = midIndex -1;

            } else {
                return midElement;
            }

            }             return -1;

    }

    public static void main(String[] args) {
        System.out.println(binarySearch(-10));
        System.out.println(counter);
    }
    }


