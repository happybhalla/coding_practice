package ds.linkedlist;

public class MiddleElement {

    void printMiddle(Node head)
    {
        int count = 0;
        Node mid = head;

        while (head != null)
        {

            // Update mid, when 'count'
            // is odd number
            if ((count % 2) == 1)
                mid = mid.next;

            ++count;
            head = head.next;
        }

        // If empty list is provided
        if (mid != null)
            System.out.println("The middle element is [" +
                    mid.data + "]\n");
    }

    public static void main(String[] args) {
        Node head = new Node(10,null);
        head.next = new Node(20,null);
        head.next.next = new Node(30,null);

        MiddleElement ob = new MiddleElement();
        ob.printMiddle(head);
        while (head.next != null ){
            System.out.println(head.getData());
            head = head.next;

        }
    }
}
