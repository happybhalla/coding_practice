package ds.arrays;


import java.util.LinkedList;

/*
* K=2
*
indexSkip [] int =[0,2] //2P,0T

calculate maximum number of thieves that can be caught if each Police can catch only 1 Thief who is at most K units away from him
array -> {'T', 'T', 'P', 'P', 'T', 'P'} N*NLogn


         {'T', 'P', 'T', 'P'}


condition  distance =k
*
*   for()
*       look for P
*        check the fartest T
*           make entry into array.
*
*
*
*
*
*
*
 *
  * Reverse a Linked List in groups of given size
count = 3




1->2->3->4->5->6->7->8->NULL
3->1->2->4 ------
3->2->1->4------

 6

3->2->1->6->5->4->8->7->NULL


3->2->-1>

given size = 3

3->2->1->6->5->4->8->7->NULL


for(to linkedlist +n)
 {

  i<c-1

  n =0
  n =1
  n =2

  nth node -> n-i Node



     n    ->  n

 }

*
*
* */
public class Test {

    public static int getMaxT(char input[],int k){

       int [] res ;
       int tCount = 0 ;
       for(int i = 0 ; i < input.length;i++){
           if( input[i] == 'P')
           {
               //index check apply
               boolean found = false;
               for(int j =i-k ;j <i;j++){
                   if( input[i] == 'T'){
                       tCount++;
                       found = true;
                       break;
                   }
               }

               if(!found) {
                   for (int j = i; j < i + k; j++) {
                       if (input[i] == 'T') {
                           tCount++;
                           break;
                       }
                   }
               }

           }
       }


        return  0;
    }

    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data =data;
            this.next =null;
        }
    }

    public  static  void getList(LinkedList<Integer> input){

        //Node head = null;
        //Node nd = new Node(1);


        for(int j = 0 ; j< input.size();j=j+3){

            for(int i =j ;i <3;i++){



            }

        }



    }



    public static void main(String[] args) {

        //main starting point test 1
        char [] input = {'T', 'T', 'P', 'P', 'T', 'P'};

        //getMaxT(input,k);

    }
}
