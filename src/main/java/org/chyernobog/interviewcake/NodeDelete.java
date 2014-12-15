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
package org.chyernobog.interviewcake;

/**
 * Delete a node from a singly-linked list, given only a variable pointing to
 * that node.
 *
 * @author Roger
 */
public class NodeDelete {


    public static void nodeDelete(Node n) {
        if (n == null) return;
        Node prev = null;
        while (n.next != null) {
          n.value = n.next.value;
          prev = n;
          n = n.next;
        }
        if (prev != null) prev.next = null;
    }

    public static void main(String[] args) {
        Node a = new Node('A');
        Node b = new Node('B');
        Node c = new Node('C');
        
        a.next = b;
        b.next = c;
        
        nodeDelete(b);
        
    }
    

    public static class Node {
        public char value;
        public Node next;

        public Node(char val) {
            value = val;
        }
    }
}
