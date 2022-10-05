package OOP;

import java.util.Arrays;

public class OOPStyle {
    public static void main(String[] args) {
        SortUtil sort = new SortUtil();
        SearchUtil search = new SearchUtil();
        int [] sortedArray = sort.bubbleSort(new int[] {10, 5, 0, -2, 11});
        System.out.println("Arrays.toString(sortedArray) = " + Arrays.toString(sortedArray));
        int result = search.binarySearch(sortedArray, 10);
        System.out.println("result = " + result);
    }
}
