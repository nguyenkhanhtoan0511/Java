package com.nokia.java.example;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");
        ll.add(1, "A2");
        System.out.println("Noi dung ban dau cua LinkedList: " + ll);
        ll.remove("F");
        ll.remove(2);
        System.out.println("Noi dung cua LinkedList sau khi xoa: " + ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println("LinkedList sau khi xoa phan tu dau tien va cuoi cung: " + ll);
        Object val = ll.get(2);
        ll.set(2, (String) val + " Dathaydoi");
        System.out.println("LinkedList sau khi thay doi: " + ll);
    }
}