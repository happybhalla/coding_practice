package sorting;

public class Qs {

    public static int getPartition(int [] input ,int low ,int high){

            int pivot = input[high];
            int i =low;
        for (int j = low;j<high;j++){
            if( pivot >= input[j]){
                int tem= input[j];
                input[j]= input[i];
                input[i]=tem;
                i++;
            }
        }

        int tem = input[i];
        input[i] = pivot;
        input[high] = tem;

        return i;
    }


    public static void sort(int[] input , int low ,int high){


        if(low<high){
            int partition = getPartition(input,low,high);
                    sort(input,0,partition-1);
                    sort(input,partition+1,high);

        }



    }
    public static void main(String[] args) {
        int [] input = {-3, 23, 9, 18, 61, -10};
         sort(input,0,input.length-1);
         System.out.println(input.toString());

    }
}
