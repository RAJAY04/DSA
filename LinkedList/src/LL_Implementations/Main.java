package LL_Implementations;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(7);
        list.insertFirst(8);
        list.insertFirst(9);
        list.insertLast(10);
        list.insert(3, 100);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.insertRec(9,1);
        list.display();

//        LL_Implementations.DLL list = new LL_Implementations.DLL();
//        list.insertFirst(5);
//        list.insertFirst(6);
//        list.insertFirst(7);
//        list.insertFirst(8);
//        list.insertFirst(9);
//        list.insertLast(10);
//        list.insert(8,20);
//        list.display();

//        LL_Implementations.CLL list = new LL_Implementations.CLL();
//        list.insert(23);
//        list.insert(3);
//        list.insert(13);
//        list.insert(43);
//        list.insert(33);
//        list.display();
//        list.delete(13);
//        list.display();






    }
}
