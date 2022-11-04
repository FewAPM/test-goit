package hw9;

public class MyLinkedListGeneric <T> {

    private Node <T> first;
    private Node <T> last;

    int size = 0;

    private static class Node <T> {
        private T element;
        Node <T> next;
        Node <T> previous;

        public Node (T element) {

            this.element = element;
        }
    }


    public void add(T element) {
        Node <T> newNode = new Node<>(element);
        if (first == null) {
            newNode.next = null;
            newNode.previous = null;

            first = newNode;
            last = newNode;
        } else {

            last.next = newNode;
            newNode.previous = last;
            last = newNode;
        }
        size++;
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
        MyLinkedListGeneric <String> list = new MyLinkedListGeneric<>();
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
