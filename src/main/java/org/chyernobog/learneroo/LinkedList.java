/*
 * Copyright (C) 2014 Roger
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.chyernobog.learneroo;

import java.util.Scanner;

class LinkedList {

    Node head;
    Node tail;
    private int size = 0;

    /*
     * Adds Node to end of list with given `num` as data
     * Make sure it correctly sets the head (and tail) 
     * when adding the first item to the list
     */
    public void add(int num) {
        System.out.println("List before adding " + num);
        printCurrentList();
        Node last = new Node(num);
        if (head != null && tail != null) {
            tail.next = last;
            tail = last;
        } else if (head == null && tail == null){
            head = last;
            tail = last;
        }
        size++;
        System.out.println("List after adding " + num);
        printCurrentList();
    }

    public void add(int index, int num) {
        System.out.println("List before adding " + num);
        printCurrentList();
        Node toAdd = new Node(num);
        if (index == 0) {
            toAdd.next = head.next;
            head = toAdd;
        } else if (index == size) {
            add(num);
            return;
        } else {
            Node cur = head;
            for (int x = 0; x < index-1 && cur.next != null; x++) {
                cur = cur.next;
            }
            toAdd.next = cur.next;
            cur.next = toAdd;
        }
        size++;
        System.out.println("List after adding " + num);
        printCurrentList();
    }

    public void remove(int index) {
        Node cur = head;
        for (int x = 0; x < index - 1; x++) {
            cur = cur.next;
        }
        Node tmp = cur.next;
        cur.next = tmp.next;
        tmp.next = null;
        size--;
        printCurrentList();
    }

    /*
     * Returns value of node at given index
     */
    public int get(int index) {
        Node cur = head;
        for (int x = 0; x <= index && cur.next != null; x++) {
            cur = cur.next;
        }
        return cur.data;
    }

    public int size() {
        return this.size;
    }
    
    public void printCurrentList() {
    	Node cur = head;
    	StringBuilder s = new StringBuilder();
    	while (cur != null && cur.next != null) {
    		s.append("Node ").append(cur.data).append(" -> ");
    		cur = cur.next;
    	}
    	System.out.println(s.toString());
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        //Scanner in = new Scanner(System.in);
        Scanner in = new Scanner("10\n"
                + "-9 3\n"
                + "-9 5\n"
                + "1 11\n"
                + "2 13\n"
                + "-6 1\n"
                + "-6 3\n"
                + "-1 2\n"
                + "-1 0\n"
                + "-1 1\n"
                + "-6 0\n");

        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            if (a == -6) {
                System.out.println(list.get(b));
            } else if (a == -9) {
                list.add(b);
            } else if (a == -1) {
                list.remove(b);
            } else {
                list.add(a, b);
            }
        }
    }
}

class Node {

    int data;
    Node next;

    public Node(int d) {
        data = d;
    }

    public Node(int d, Node n) {
        data = d;
        next = n;
    }
}
