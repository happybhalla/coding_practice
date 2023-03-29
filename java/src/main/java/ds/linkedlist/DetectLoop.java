package ds.linkedlist;


import java.util.HashSet;

public class DetectLoop {
    // Returns true if there is a loop in linked
    // list else returns false.
    // TC: O(N)
    // AC: O(N)
    static boolean detectLoop(Node h)
    {
        HashSet<Node> s = new HashSet<Node>();
        while (h != null) {

            if (s.contains(h))
                return true;

            // If we are seeing the node for
            // the first time, insert it in hash
            s.add(h);

            h = h.next;
        }

        return false;
    }

    //Implementation of Floyd’s Cycle-Finding Algorithm:
    //Time complexity: O(N), Only one traversal of the loop is needed.
    //Auxiliary Space: O(1).
    public static void detectLoop2(Node head)
    {
        Node slow_p = head, fast_p = head;
        int flag = 0;
        while (slow_p != null && fast_p != null
                && fast_p.next != null) {
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;
            if (slow_p == fast_p) {
                flag = 1;
                break;
            }
        }
        if (flag == 1)
            System.out.println("Loop Found");
        else
            System.out.println("No Loop");
    }

    public static void main(String[] args) {

    }
}
