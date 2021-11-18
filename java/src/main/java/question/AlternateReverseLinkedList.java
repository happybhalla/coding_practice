package question;
/*
input : -  1 2 3 4 5
1 2 3 4 5 6 7 8 9
1 9  2 8 3 7 4 6 5

1 6 2 5 3 4

           1 2 3 4 5
output :-  1 5 2 4 3
 */
public class AlternateReverseLinkedList {

    public static Node halfReverse(Node current,int count){


        Node prev = null;
        while (count > 1){
            count--;
            current = current.next;
        }


        Node temp =null;

        while (current !=null) {
            temp = current.next;
            current.next =prev;
            prev = current ;
            current = temp;
        }

        return  prev;
    }

    public static Node getCorrected(Node node){

        int count = 0;
        Node head = node;

        while (node != null){
            node = node.next;
            count++;
        }

        if(count%2==0){
            count = count/2+1;
        }else {
            count = count/2+2;
        }
        Node reverseNode = halfReverse(head,count);







        return null;
    }

    public static void main(String[] args) {
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);
    head.next.next.next.next =  new Node(5);
        getCorrected(head);
    }
}
