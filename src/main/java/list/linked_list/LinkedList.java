package list.linked_list;
public class LinkedList {
    Node head;
    Node tail;
    Node current;
    private class Node {
        Node prev;
        Node next;
        int value;
        Node(int value) {
            this.value = value;
        }
    }

    public int getPrev() {
        return tail.prev.value;
    }
    public void add(int el) {
        Node node = new Node(el);
        if (head == null) {
            head = node;
            tail = node;
            current = node;
            return;
        }
        node.prev = tail;
        tail.next = node;
        tail = node;

    }
    public void addFirst(int el) {
        Node node = new Node(el);
        if (head == null) {
            head = node;
            tail = node;
            current = node;
            return;
        }
        head.prev = node;
        node.next = head;
        head = node;
    }
    public void addLast(int el) {
        Node node = new Node(el);
        if (head == null) {
            head = node;
            tail = node;
            current = node;
            return;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    public int get(int value) {
        current = head;
        while (current != null) {
            if (current.value == value) return current.value;
            current = current.next;
        }
        return -1;

    }
    public boolean delete(int value) {
        current = head;
        while (current != null) {
            if (current.value == value) {
                if (current.prev == null) {
                    if (head.next == null) {
                        current = null;
                        return true;
                    }
                    head.next.prev = null;
                    head = head.next;
                    return true;
                }
                if (current.next == null) {
                    tail.prev.next = null;
                    tail = tail.prev;
                    return true;
                }
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                    return true;
                }
            current = current.next;
        }
        return false;
    }
    public int getSize() {
        int size = 0;
        current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    private int findLargest() {
        int max = head.value;
        current = head;
        while (current != null) {
            if (current.value > max) max = current.value;
            current = current.next;
        }
        return max;
    }
    private int findSmallest() {
        int min = head.value;
        current = head;
        while (current != null) {
            if (current.value < min) min = current.value;
            current = current.next;
        }
        return min;
    }
    public LinkedList sortUp() {
        int max = 0;
        int size = this.getSize();
        LinkedList linkedList = new LinkedList();
        current = head;
        for (int i = size; i > 0; i--) {
            max = this.findLargest();
            this.delete(max);
            linkedList.addFirst(max);
        }
        return linkedList;
    }
    public LinkedList sortDown() {
        int min = 0;
        int size = this.getSize();
        LinkedList linkedList = new LinkedList();
        current = head;
        for (int i = size; i > 0; i--) {
            min = this.findSmallest();
            this.delete(min);
            linkedList.addFirst(min);
        }
        return linkedList;
    }

    @Override
    public String toString() {
        String s = "";
        current = head;
        while (current != null) {
            s += current.value + ", ";
            current = current.next;
        }
        return s;
    }
}
