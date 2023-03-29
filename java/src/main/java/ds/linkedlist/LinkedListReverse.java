package ds.linkedlist;




 class LLNode {
    private int data;
    LLNode node ;
    LLNode(int data){
        this.data=data;
        this.node= null;
    }


    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public LLNode getNode() {
        return node;
    }

    public void setNode(LLNode node) {
        this.node = node;
    }
}
public class LinkedListReverse {

    public int getCount(LLNode head){
        int count =1 ;

        while (head.getNode() != null){

            head = head.getNode();
            count++;
        }

        return  count;
    }

    public LLNode revLinkList(LLNode head , int range){
        LLNode temp = head;
        LLNode rev = head;

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
        LLNode head = null;
        LLNode tail= null;

        for (int i = 1; i <= 10; i++) {
            LLNode nd = new LLNode(i);
            if(head ==null){
                   head = nd;
            }else {
                tail.setNode(nd);
            }
           tail = nd;
        }
        LinkedListReverse obj = new LinkedListReverse();
        System.out.println( obj.getCount(head));

        LLNode temp = head;
        while (temp.getNode() != null){
            System.out.println(temp.getData());
            temp = temp.getNode();
        }
        System.out.println(temp.getData());
    }

}
