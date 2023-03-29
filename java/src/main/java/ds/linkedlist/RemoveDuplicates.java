package ds.linkedlist;

public class RemoveDuplicates {

    public static void removeDuplicates(Node head) {
        System.out.println(head);
        Node first = head;
        while (head != null) {

            while (head.next != null && head.data == head.next.data) {
                head.next = head.next.next;

            }
            head = head.next;
        }
        System.out.println("removed");
        while (first != null) {
            System.out.println(first.data);
            first = first.next;
        }
    }


    public static void main(String[] args) {
        Node head = new Node(10, null);
        head.next = new Node(10, null);
        head.next.next = new Node(20, null);
        head.next.next.next = new Node(20, null);
        head.next.next.next.next = new Node(20, null);

        removeDuplicates(head);

//        while (head != null){
//            System.out.println(head.data);
//            head = head.next;
//        }


    }
}
