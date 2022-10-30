package myLinkedList;

public class MyLinkedListTest <T> {

    private Node <T> first; // початок списку
    private Node <T> last; // кінець списку

    int size = 0;// розмір списку

    private static class Node <T> {
        private T element;// значення (назва) ноди
        Node <T> next; // посилання на наступну ноду
        Node <T> previous; // посилання на попередню ноду

        public Node (T element) { // конструктор ноди, з ініціалізацією її значення
            this.element = element;
        }
    }


    public void add(T element) {
        Node <T> newNode = new Node<>(element); // створюємо нову ноду
        if (first == null) { // якщо список пустий, тобто first is null то робимо:
            newNode.next = null; // посилання на наступну   null
            newNode.previous = null; // посилання на попередню ноду будуть null
            // newNode буде first and last ноди
            first = newNode;
            last = newNode;
        } else {
            // якщо список вже не пустий, то вписуємо в кінець
            last.next = newNode;// змінюємо посилання з null на нову ноду
            newNode.previous = last; // нова нода буде посилатися на попередню, що була раніше last
            last = newNode;// тепер нова нода стане останньою і її посилання на next - null
        }
        size++;// після кожного створення ноди збільшуємо розмір
    }


    public void clear() {
        first = null;
        last = null;
        size = 0;
    }


    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node <T> result = first;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }

        return result.element;
    }



    public void remove(int index) {
        if (index < 0 || index > size - 1) {
            throw new IllegalArgumentException();
        }
        if (index == 0) {
            first = first.next;
        } else {
            Node <T> node = findNodeBeforeByIndex(index);
            Node <T> tmp = findByIndex(index);
            node.next = tmp.next;
        }
        size--;
    }
    private Node <T> findByIndex(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException();
        }
        int tmpIndex = 0;
        if (first == null) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            return first;
        }

        Node <T> node = first;
        while (node.next != null) {
            node = node.next;
            tmpIndex++;
            if (tmpIndex == index) {
                return node;
            }
        }
        throw new IndexOutOfBoundsException();
    }
    private Node <T> findNodeBeforeByIndex(int index) {
        if (index <= 0 || index > size - 1) {
            return null;
        }

        int count = 0;
        Node <T> node = first;
        while (node.next != null) {
            if (count == index - 1) {
                return node;
            }
            count++;
            node = node.next;
        }
        return null;
    }



    public static void main(String[] args) {
        MyLinkedListTest <String> list = new MyLinkedListTest<>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        System.out.println("list.size = " + list.size);
        System.out.println("list.get(0) = " + list.get(0));
        System.out.println("list.get(1) = " + list.get(1));
        System.out.println("list.get(2) = " + list.get(2));
        list.remove(1);
        System.out.println("After remove index 1");
        System.out.println("list.size = " + list.size);
        System.out.println("list.get(0) = " + list.get(0));
        System.out.println("list.get(1) = " + list.get(1));
        list.clear();
        System.out.println("After clear");
        System.out.println("list.size = " + list.size);

        list.add("First");
        list.add("Second");
        list.add("Third");
        System.out.println("list.size = " + list.size);
        System.out.println("list.get(0) = " + list.get(0));
        System.out.println("list.get(1) = " + list.get(1));
        System.out.println("list.get(2) = " + list.get(2));

    }
}
