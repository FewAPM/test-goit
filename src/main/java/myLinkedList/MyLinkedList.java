package myLinkedList;

public class MyLinkedList {

//    /*
//
//    * Не можна використовувати масив. Кожний елемент має бути окремим об'єктом-посередником (Node - нода), що зберігає посилання на попередній та наступний елемент колекції (двозв'язний список).
//       Методи
//       1) add(Object value) додає елемент в кінець
//       2) remove(int index) видаляє елемент з вказаним індексом
//       3) clear() очищає колекцію
//       4) size() повертає розмір колекції
//       5) get(int index) повертає елемент по індексу
//
//    * */
//    private Node first;
//    private Node last;
//
//    int size = 0;
//
//    private static class Node {
//        int element;
//        Node next;
//        Node previous;
//
//        public Node(int element) {
//            this.element = element;
//        }
//    }
//
//
//    public void add(int element) {
//        Node newNode = new Node(element);
//        if (first == null) {
//            newNode.next = null;
//            newNode.previous = null;
//            first = newNode;
//            last = newNode;
//        } else {
//            last.next = newNode;
//            newNode.previous = last;
//            last = newNode;
//        }
//        size++;
//    }
//
//
////    public void add(int index, int element) {
////        if (index < 0 || index >= size) {
////            throw new IndexOutOfBoundsException();
////        }
////        Node newNode = new Node(element);
////        if (index == 0) {
////            add(element);
////        }
////        if (index == size) {
////            last.next = newNode;
////            last = newNode;
////        }
////        Node oldNode = first;
////        for (int i = 0; i < index; i++) {
////            oldNode = oldNode.next;
////        }
////        Node oldPrevious = oldNode.previous;
////        oldPrevious.next = newNode;
////        oldNode.previous = newNode;
////
////        newNode.previous = oldPrevious;
////        newNode.next = oldNode;
////        size++;
////    }
//
//    public void clear() {
//        first = null;
//        last = null;
//        size = 0;
//    }
//
//
////    public boolean contains(int element) {
////        for (int i = 0; i < size; i++) {
////            if (get(i) == element) {
////                return true;
////            }
////        }
////        return false;
////    }
//
//
//    public int get(int index) {
//        if (index < 0 || index >= size) {
//            throw new IndexOutOfBoundsException();
//        }
//        Node result = first;
//        for (int i = 0; i < index; i++) {
//            result = result.next;
//        }
//
//        return result.element;
//    }
//
//
//
//public void remove(int index) {
//    if (index < 0 || index > size - 1) {
//        throw new IllegalArgumentException();
//    }
//    if (index == 0) {
//        first = first.next;
//    } else {
//        Node node = findNodeBeforeByIndex(index);
//        Node tmp = findByIndex(index);
//        node.next = tmp.next;
//    }
//    size--;
//}
//    private Node findByIndex(int index) {
//        if (index < 0 || index > size - 1) {
//            throw new IndexOutOfBoundsException();
//        }
//        int tmpIndex = 0;
//        if (first == null) {
//            throw new IndexOutOfBoundsException();
//        }
//
//        if (index == 0) {
//            return first;
//        }
//
//        Node node = first;
//        while (node.next != null) {
//            node = node.next;
//            tmpIndex++;
//            if (tmpIndex == index) {
//                return node;
//            }
//        }
//        throw new IndexOutOfBoundsException();
//    }
//    private Node findNodeBeforeByIndex(int index) {
//        if (index <= 0 || index > size - 1) {
//            return null;
//        }
//
//        int count = 0;
//        Node node = first;
//        while (node.next != null) {
//            if (count == index - 1) {
//                return node;
//            }
//            count++;
//            node = node.next;
//        }
//        return null;
//    }
//
//
//
//    public static void main(String[] args) {
//        MyLinkedList list = new MyLinkedList();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        System.out.println("list.size = " + list.size);
//        System.out.println("list.get(0) = " + list.get(0));
//        System.out.println("list.get(1) = " + list.get(1));
//        System.out.println("list.get(1) = " + list.get(2));
//        list.remove(1);
//        System.out.println("After remove index 1");
//        System.out.println("list.size = " + list.size);
//        System.out.println("list.get(0) = " + list.get(0));
//        System.out.println("list.get(1) = " + list.get(1));
//        list.clear();
//        System.out.println("After clear");
//        System.out.println("list.size = " + list.size);
//
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        System.out.println("list.size = " + list.size);
//        System.out.println("list.get(0) = " + list.get(0));
//        System.out.println("list.get(1) = " + list.get(1));
//        System.out.println("list.get(1) = " + list.get(2));
//
//    }

}
