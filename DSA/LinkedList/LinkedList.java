package DSA.LinkedList;

import java.util.*;

public class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void display() {
        if (head == null)
            return;
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("NULL");
    }

    void add(int data) { // adding at last
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    void addAtMid(int pos, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            for (int i = 0; i < pos - 1; i++) {
                current = current.next;
            }
            Node t = current.next;
            current.next = newNode;
            newNode.next = t;
        }
    }

    void addAtStarting(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    void delAtEnd() {
        if (head == null)
            return;
        Node current = head;
        if (current.next == null) {
            head = head.next;
            return;
        }
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    void delAtMid(int pos) {
        if (head == null)
            return;
        Node current = head;
        for (int i = 0; i < pos - 2; i++) {
            current = current.next;
        }
        current.next = current.next.next;
    }

    void delAtStarting() {
        if (head == null)
            return;
        head = head.next;
    }

    void reverse() {
        Node previous = null;
        Node next = null;
        Node current = head;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(66);

        l1.addAtMid(3, 4);
        // l1.display();

        l1.addAtMid(2, 22);
        // l1.display();

        l1.addAtStarting(0);
        l1.display();

        l1.delAtEnd();
        l1.display();

        l1.delAtStarting();
        l1.display();

        l1.delAtMid(2);
        l1.display();
        
        l1.reverse();
        l1.display();
    }
}
