package LL_Implementations;

public class CLL {
    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display(){
        Node node = head;
        //we are using a do while loop when we want something to be executed at least once
        if(head != null){
            do{
                System.out.print(node.value + " -> ");
                node = node.next;
            }while(node != head);
        }
        System.out.println("HEAD");
    }

    public void delete(int value){
        Node node = head;
        if(node == null){
            return;
        }
        if(node.value == value){
            head = head.next;
            tail.next = head;
            return;
        }
        do{
            Node n = node.next;
            if(n.value == value){
                node.next = n.next;
                break;
            }
            node = node.next;  // Add this line to move to the next node
        }while(node.next != head);  // Modify the condition here
    }

    private class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }


}
