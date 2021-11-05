package ds.linkedlist;


import org.omg.CORBA.NO_IMPLEMENT;

import java.util.LinkedList;

class Node{
    private int data;
    Node node ;
    Node(int data){
        this.data=data;
        this.node= null;
    }


    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }
}
public class LinkedListReverse {

    public int getCount(Node head){
        int count =1 ;

        while (head.getNode() != null){

            head = head.getNode();
            count++;
        }

        return  count;
    }

    public Node revLinkList(Node head ,int range){
        Node temp = head;
        Node rev = head;

        while (range / 2 >=0)
        while (range == 0) {
            temp = temp.getNode();

            range--;
        }

       rev  = temp.getNode();
       temp =  head;

        return head;
    }

    public static void main(String[] args) {
        Node head = null;
        Node tail= null;

        for (int i = 1; i <= 10; i++) {
            Node nd = new Node(i);
            if(head ==null){
                   head = nd;
            }else {
                tail.setNode(nd);
            }
           tail = nd;
        }
        LinkedListReverse obj = new LinkedListReverse();
        System.out.println( obj.getCount(head));

        Node temp = head;
        while (temp.getNode() != null){
            System.out.println(temp.getData());
            temp = temp.getNode();
        }
        System.out.println(temp.getData());
    }

}
