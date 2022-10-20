package firstClassesBeginningOther;

public class LinearSearch {
    private static int linearSearch(int[] arr, int search) {
        int [] array = arr;
        int elemToSearch = search;
        int resultElem = -1;
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            counter++;
            if(elemToSearch == array[i]) {
                resultElem = array[i];
                break;
            }

        }

        System.out.println("counter : " + counter);
        System.out.println("array length: " + array.length);
        System.out.println("resultElem : " + resultElem);
        System.out.println("resultElem index in array : " + (counter - 1));
        return resultElem;
    }
    public static void main(String[] args) {
    new LinearSearch().linearSearch(new int[] { -10, -9, -7, -5,-4,0,1,2,3,4,5,6,10,11,23,25,26,28,29}, 10); // counter 13
       // System.out.println(linearSearch(new int[] { -10, -8, 6, 5, 3, 0, 1, 5, 7, 25}, 5));




        }


}

