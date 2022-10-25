package moduleNine;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringJoiner;


/*      add(Object value) додає елемент в кінець
        remove(int index) видаляє елемент з вказаним індексом
        clear() очищає колекцію
        size() повертає розмір колекції
        get(int index) повертає елемент по індексу*/
public class MyArrayList <T> {
    private static final int SIZE = 8;
    Object [] data = new Object[SIZE];
    Integer index = 0;

    public void add(T a) {
        if (data.length == 0) {
            data = new Object[SIZE];
        }
        if(index == data.length) {
            System.out.println("Size is doubled" + "index " + index);
            int newSize = index * 2;
            Object [] newData = new Object[newSize];
            System.arraycopy(data, 0, newData, 0, index);
            data = newData;
        }
        data[index] = a;
        index++;
    }

    public void remove(T i) {

        Object [] beforeI = Arrays.copyOf(data, (Integer) i); // кусок масиву перед елементом, що видаляється
        // кусок масиву після елементу, що видаляється
        Object [] afterI = new Object[data.length-1- beforeI.length]; // масив розміром - 1 та - beforeI
        // з якого масиву/ з якого індексу/ в який мавсивб/ в який індекс/ та якої довжини
        System.arraycopy(data,  (Integer)i+1, afterI,0,afterI.length);

        // об'єднуємо after and before
        Object [] newData = new Object[afterI.length + beforeI.length];
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

    public Integer get(Integer index){
        return (Integer) data[index];
    }

    public void clear(){
        data = new Object[0];
        index = 0;
    }

        @Override
    public String toString() {
        if (data.length == 0){

            return "[]";
        }
        StringJoiner result = new StringJoiner(", ");
        for (int i = 0; i < index; i++) {
                result.add(Integer.toString((Integer) data[i]));
        }
        return "[ " + result + " ]";
    }
}
