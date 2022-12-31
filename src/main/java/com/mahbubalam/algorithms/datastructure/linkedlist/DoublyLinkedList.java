package com.mahbubalam.algorithms.datastructure.linkedlist;

public class DoublyLinkedList {
    private int size = 0;
    private Node head;
    private Node tail;

    public static void main(String[] args) throws Exception {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        for (int i = 0; i < 10; i++) {
            doublyLinkedList.add(i);
        }
        System.out.println(doublyLinkedList.delete(5));
        System.out.println();
        System.out.println(doublyLinkedList.deleteFirst());
        System.out.println();
        System.out.println(doublyLinkedList.deleteLast());
        System.out.println();
        doublyLinkedList.addAt(78, 3);
        System.out.println();
        doublyLinkedList.printLinkedList();
        System.out.println();
        doublyLinkedList.deleteAt(3);
        System.out.println();
        doublyLinkedList.printLinkedList();
        System.out.println();
        System.out.println(doublyLinkedList.size);
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
            tail.next.prev = tail;
            tail = tail.next;
        }
        size++;
    }

    public void addFirst(int data) {
        if (isEmpty()) {
            head = tail = new Node(data);
        } else {
            head.prev = new Node(data);
            head.prev.next = head;
            head = head.prev;
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
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
        size++;
    }

    public int delete(int data) {
        if (head.data == data) return deleteFirst();
        if (tail.data == data) return deleteLast();
        Node node = search(new Node(data));
        node.prev.next = node.next;
        node.next.prev = node.prev;

        int value = node.data;
        node = null;
        size--;
        return value;
    }

    public int deleteLast() {
        if (head == null) throw new RuntimeException();

        int value;
        if (head.next == null) {
            value = head.data;
            head = null;
            return value;
        }


        Node temp = tail;
        tail = tail.prev;
        tail.next = null;

        value = temp.data;
        temp = null;
        size--;
        return value;
    }

    public int deleteAt(int index) throws Exception {
        if (index > size || index < 0) throw new Exception("index not found");
        if (index == 0) return deleteFirst();
        if (index == size) return deleteLast();

        Node node = search(index);
        node.prev.next = node.next;
        node.next.prev = node.prev;
        int value = node.data;
        node = null;
        size--;
        return value;
    }

    public int deleteFirst() {
        Node temp = head;
        head = head.next;
        head.prev = null;
        temp.next = null;
        int value = temp.data;
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

    private Node search(Node node) {

        for (Node temp = head; temp.next != null; temp = temp.next) {
            if (temp.data == node.data) return temp;
        }
        return null;
    }

    private Node search(int index) {

        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
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
        private Node next, prev;


        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

}
