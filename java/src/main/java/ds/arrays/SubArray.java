package ds.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
*
* {5, 1, 3, 2, 6}
12
n2
* */


public class SubArray {

    public  static int getSubString(int[] input,int sum){
        //r=1

        Arrays.sort(input);

        int sumCount  ;

         Set<String> s1= new HashSet<String>();
         int result= 0;

        for(int i= 0 ;i <input.length-1 ;i++ ) {

            int count = 0;
            sumCount = input[i];
            for(int k= i+1 ;k <input.length-1 ;k++ ){

                int secondPlace= input[k];

                for( int j =k+1 ;j < input.length-1;j++){


                   if( sumCount+secondPlace +input[j]<12){
                       result++;
                   }

                }



            }

        }


        return 1;
    }

    public static void main(String[] args) {



    }
}
