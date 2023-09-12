import javax.swing.plaf.synth.SynthOptionPaneUI;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
       } size++;
    }

    public void display(){
        Node temp = head;
        //temp is pointing to the node that head is pointing to
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    //these op take O(1) time
    //incase we didnt have a tail we had to traverse the whole list to get to the last node
    public void insertLast(int val){
        Node node = new Node(val);
        if(tail == null){
            insertFirst(val);
        }
            tail.next = node;
            tail = node;
            size++;
    }

    public void insert(int index , int val) {
        if (index == 0) {
            insertFirst(val);
            return;
        } else if (index == size) {
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;//reaching the point where we have to insert the node
        }
        Node node = new Node(val,temp.next);
        temp.next = node;

    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        if(size <= 1){
            deleteFirst();
        }
        Node secondLast = get(size - 1);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }
    //the below function gets the last index used for deletelast function
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int delete(int index){
        if(index == 0){
            deleteFirst();
        } else if (index == size - 1) {
            deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        return val;
    }

    //now we are given a index and we need to find its node
    public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }return null;//not found case
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;

        }
    }
}
