package dev.harini.DataStructure;

public class SinglyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public SinglyLinkedList(){
        this.size = 0;
    }

    // Time complexity: O(1)
    // Auxiliary Space: O(1)
    public void insertFirt(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size++;
    }

    // Time complexity: O(1)
    // Auxiliary Space: O(1)
    public void insertlast(int val){
        if(tail == null){
            insertFirt(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    // Time complexity: O(n)
    // Auxiliary Space: O(1)
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
    }

    // Time complexity: O(n)
    // Auxiliary Space: O(1)
    public void insertAtIndex(int val, int index){
        if(index == 0){
            insertFirt(val);
            return;
        }
        if(index == size){
            insertlast(val);
            return;
        }

        Node temp = head;
        for(int i=1; i<index;i++){
            temp = temp.next;
        }

        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
    }

    // Time complexity: O(1)
    // Auxiliary Space: O(1)
    public int deleteFirst(){
        if(head == null){
            System.out.println("The List is empty");
            return -1;
        }
        int data = head.value;
        head = head.next;

        if(head == null){
            System.out.println("All elements are deleted");
            tail = null;
        }
        size --;
        return data;
    }

    // Time complexity: O(n)
    // Auxiliary Space: O(1)
    public int deleteLast(){
        if(tail ==  null){
            System.out.println("The List is Empty");
            return -1;
        }

        if(size <= 1){
            deleteFirst();
        }

        Node temp = head;
        for(int i=1;i<size-1;i++){
            temp = temp.next;
        }

        int data = temp.next.value;
        temp.next = null;
        tail = temp;

        size--;
        return data;
    }

    // Time complexity: O(n)
    // Auxiliary Space: O(1)
    public int deleteAtIndex(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }

        Node temp = head;
        for(int i=1;i<index;i++){
            temp = temp.next;
        }
        int data = temp.next.value;
        temp.next = temp.next.next;

        size--;
        return data;
    }

    // Time complexity: O(n)
    // Auxiliary Space: O(1)
    public Node find(int val){
        Node temp = head;
        while(temp != null){
            if(temp.value == val){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
   
    private class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
            this.next = null;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
