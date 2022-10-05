package OOP;

public class SearchUtil {
   public int binarySearch(int [] array, int elementForSearch){
        int lowestIndex = 0;
        int highestIndex = array.length-1;


        while (lowestIndex <= highestIndex) {
            int midIndex = (lowestIndex + highestIndex) / 2;
            int midElement = array[midIndex];
            if (midElement < elementForSearch) {
                lowestIndex = midIndex +1;

            } else if (midElement > elementForSearch) {
                highestIndex = midIndex -1;

            } else {
                return midElement;
            }

        }
        return -1;

    }
}
