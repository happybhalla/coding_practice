package ds.arrays;

import java.util.*;
/*
*
* Acco queation asked.
* */

public class MergedSortedArray {

    /*
    arr1[] = { 11,33,55,77,99}
    arr2[] = { 22,44,66,88 }
     */
    public static void main(String[] args) {



        int []input1 =  { 12,22,32,52,91,};
        int []input2 = { 11,31,51,61,61 };


        int count = input1.length+input2.length ;

        List<Integer> list = new ArrayList<Integer>();
        int [] result = new int[count-2];

        int i =0 ;
        int j =0 ;
        while (i<input1.length && j<input2.length){
            if(input1[i] <= input2[j]){
                list.add(input1[i]);
                i++;
            }else {
                list.add(input2[j]);
                j++;
            }

        }

        while (i < input1.length){
            list.add(input1[i]);
            i++;
        }
        while (j < input1.length){
            list.add(input2[j]);
            j++;
        }






        // for(int i = count ; i< )
        // Collections.sort(list);
        System.out.println(list.toString());
    }
}
