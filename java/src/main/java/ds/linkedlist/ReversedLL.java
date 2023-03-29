package ds.linkedlist;

public class ReversedLL {
    public static Node reverseLL(Node head) {
        Node current = head;
        Node prev = null;

        while (current != null) {
            Node temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }

        head = prev;

        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10, null);
        head.next = new Node(20, null);
        head.next.next = new Node(30, null);

        head = reverseLL(head);
        while (head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }
}
