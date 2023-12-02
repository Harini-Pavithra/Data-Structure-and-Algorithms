package dev.harini.DataStructure;

public class CircularLinkedList {

    private Node head;
    private Node tail;

    public CircularLinkedList(){
        this.head = null;
        this.tail = null;
    }

    // Time complexity: O(1)
    // Auxiliary Space: O(1)
    public void insert(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    // Time complexity: O(n)
    // Auxiliary Space: O(1)
    public void display(){
        if(head == null){
            System.out.println("Nothing to display");
            return;
        }

        Node node = head;
        do{
            if(node != null){
            System.out.print(node.value+" -> ");
            }
            node = node.next;
        }while(node != head);
        System.out.print("HEAD");
    }

    // Time complexity: O(n)
    // Auxiliary Space: O(1)
    public void delete(int val){
        Node node = head;
        if(node == null){
            System.out.println("Nothing to delete");
            return;
        }

        if(node.value == val){
            head = head.next;
            tail.next = head;
            return;
        }
        do{
            Node temp = node.next;
            if(temp.value == val){
                node.next = temp.next;
                break;
            }
            node = node.next;
        }while(node!=head);
    }
    private class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
