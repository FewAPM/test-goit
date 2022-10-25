package moduleNine;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringJoiner;


/*      add(Object value) додає елемент в кінець
        remove(int index) видаляє елемент з вказаним індексом
        clear() очищає колекцію
        size() повертає розмір колекції
        get(int index) повертає елемент по індексу*/
public class MyArrayList {
    private static final int SIZE = 8;
    int [] data = new int[SIZE];
    int index;

    public void add(int a) {
        if(index == data.length) {
            System.out.println("Size is doubled" + "index " + index);
            int newSize = index * 2;
            int [] newData = new int[newSize];
            System.arraycopy(data, 0, newData, 0, index);
            data = newData;
        }
        data[index] = a;
        index++;
    }

    public void remove(int i) {

        int [] beforeI = Arrays.copyOf(data,i); // кусок масиву перед елементом, що видаляється
        // кусок масиву після елементу, що видаляється
        int [] afterI = new int[data.length-1- beforeI.length]; // масив розміром - 1 та - beforeI
        // з якого масиву/ з якого індексу/ в який мавсивб/ в який індекс/ та якої довжини
        System.arraycopy(data,  i+1, afterI,0,afterI.length);

        // об'єднуємо after and before
        int [] newData = new int[afterI.length + beforeI.length];
        // з якого масиву/ з якого індексу/ в який мавсивб/ в який індекс/ та якої довжини
        System.arraycopy(beforeI,0,newData,0,beforeI.length);
         // з якого масиву/ з якого індексу/ в який мавсивб/ в який індекс/ та якої довжини
        System.arraycopy(afterI,0,newData,beforeI.length, afterI.length);
        data = newData;
        index--;
    }

    public int size(){
        return index;
    }

    public int get(int index){
        return data[index];
    }

//    public void clear(){
//        int [] clear = new int[0];
//        index = 0;
//        data = clear;
//    }

        @Override
    public String toString() {
//        if (data.length == 0){
//
//            return "[]";
//        }
        StringJoiner result = new StringJoiner(", ");
        for (int i = 0; i < index; i++) {
                result.add(Integer.toString(data[i]));
        }
        return "[ " + result + " ]";
    }
}
