package moduleNine;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();

//            list.add(0);
//            list.add(1);
//            list.add(2);
        for (int i = 0; i < 13; i++) {
            list.add(i);
        }
//        System.out.println("list = " + list);
//        list.remove(1);
//        System.out.println("list = " + list);

        System.out.println(list);
        System.out.println("list.size() = " + list.size());
        list.remove(1);
        System.out.println(list);
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(1) = " + list.get(1));
      //  list.clear();
        System.out.println("list = " + list);
        list.add(0);
        list.add(1);
        System.out.println(list);


        /////////////////////////////
//        int i = 4; // елемент масиву №3
//        int [] data = new int[] {0,1,2,3,4};
//
//        System.out.println("Arrays.toString(data) = " + Arrays.toString(data));
//        int [] beforeI = Arrays.copyOf(data,i); // кусок масиву перед елементом, що видаляється
//        System.out.println("Arrays.toString(beforeI) = " + Arrays.toString(beforeI));
//
//        // кусок масиву після елементу, що видаляється
//        int [] afterI = new int[data.length-1- beforeI.length]; // масив розміром - 1 та - beforeI
//        // з якого масиву/ з якого індексу/ в який мавсивб/ в який індекс/ та якої довжини
//        System.arraycopy(data,  i+1, afterI,0,afterI.length);
//        System.out.println("Arrays.toString(afterI) = " + Arrays.toString(afterI));
//
//        // обєднуємо after and before
//        int [] newData = new int[afterI.length + beforeI.length];
//        // з якого масиву/ з якого індексу/ в який мавсивб/ в який індекс/ та якої довжини
//        System.arraycopy(beforeI,0,newData,0,beforeI.length);
//        System.out.println("Arrays.toString(newData) = " + Arrays.toString(newData));
//        // з якого масиву/ з якого індексу/ в який мавсивб/ в який індекс/ та якої довжини
//        System.arraycopy(afterI,0,newData,beforeI.length, afterI.length);
//        System.out.println("Arrays.toString(newData) = " + Arrays.toString(newData));

    }


}
