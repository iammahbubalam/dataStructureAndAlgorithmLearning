package com.mahbubalam.algorithms.datastructure.linkedlist;

public class SinglyLinkedList {
    private int size = 0;
    private Node head;
    private Node tail;

    public static void main(String[] args) throws Exception {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        for (int i = 0; i < 10; i++) {
            singlyLinkedList.add(i);
        }
//        System.out.println(singlyLinkedList.delete(5));
//        System.out.println(singlyLinkedList.deleteFirst());
//        System.out.println(singlyLinkedList.deleteLast());
        singlyLinkedList.addAt(78, 3);
        singlyLinkedList.printLinkedList();
        singlyLinkedList.deleteAt(3);
        singlyLinkedList.printLinkedList();
//        System.out.println(singlyLinkedList.size);
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void add(int data) {
        addLast(data);
    }

    public void addLast(int data) {
        if (isEmpty()) {
            head = tail = new Node(data);
        } else {
            tail.next = new Node(data);
            tail = tail.next;
        }
        size++;
    }

    public void addFirst(int data) {
        if (isEmpty()) {
            head = tail = new Node(data);
        } else {
            Node temp = new Node(data);
            temp.next = head;
            head = temp;
        }
        size++;
    }

    public void addAt(int data, int index) throws Exception {
        if (index > size || index < 0) throw new Exception("index not found");
        if (index == 0) addFirst(data);
        if (index == size) addLast(data);

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public int delete(int data) {
        if (head.data == data) return deleteFirst();
        if (tail.data == data) return deleteLast();
        Node prevNodeOfData = searchPrevNode(data);
        Node temp = prevNodeOfData.next;
        prevNodeOfData.next = temp.next;
        int value = temp.data;
        temp = null;
        size--;
        return value;
    }

    public int deleteLast() {
        if (this.head == null) throw new RuntimeException();

        int value;
        if (head.next == null) {
            value = head.data;
            head = null;
            return value;
        }


        Node temp;
        temp = this.head;
        while (temp.next.next != null)
            temp = temp.next;

        Node lastNode = temp.next;
        temp.next = null;

        value = lastNode.data;
        lastNode = null;
        size--;
        return value;
    }

    public int deleteAt(int index) throws Exception {
        if (index > size || index < 0) throw new Exception("index not found");
        if (index == 0) return deleteFirst();
        if (index == size) return deleteLast();

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }//012345
        Node deletable = temp.next;
        temp.next = deletable.next;
        int value = deletable.data;
        deletable = null;
        size--;
        return value;
    }

    public int deleteFirst() {
        Node temp = head;
        head = head.next;
        temp.next = null;
        int value = temp.data;
        temp = null;
        size--;
        return value;
    }

    public int peekLast() {
        if (isEmpty()) throw new RuntimeException("Empty list");
        return tail.data;
    }

    public int peekFirst() {
        if (isEmpty()) throw new RuntimeException("Empty list");
        return head.data;
    }

    private Node searchPrevNode(int data) {

        for (Node temp = head; temp.next.next != null; temp = temp.next) {
            if (temp.next.data == data) return temp;
        }
        return null;
    }

    private Node search(int data) {

        for (Node temp = head; temp != null; temp = temp.next) {
            if (temp.data == data) return temp;
        }
        return null;
    }

    public void printLinkedList() {
        Node temp = head;
        while (!(temp == tail.next)) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

    class Node {
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
