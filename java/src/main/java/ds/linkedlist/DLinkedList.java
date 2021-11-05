package ds.linkedlist;

import org.omg.CORBA.NO_IMPLEMENT;

 class DNode{
     DNode next;
     DNode prev;
    int data;

    DNode(int data){
        this.data = data;
    }
}


public class DLinkedList {

    //public static void push(Node node);

    public static void print(DNode head){



    }
    public static void main(String[] args) {


        DNode node = new DNode(2);
        node.prev = null;

        node.next = new DNode(2);
        node.next.prev = node.next;

        node.next.next = new DNode(3);
        node.next.prev = node.next;

        node.next.next.next = new DNode(4);
        node.next.next.prev = node.next.next;

        print(node);

    }
}
