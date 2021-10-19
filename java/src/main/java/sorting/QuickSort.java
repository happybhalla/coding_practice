package sorting;


//  2 12 15 14 3 6
public class QuickSort {

    private int[] swap(int[] input, int i, int j) {
        int[] res = {};


        return res;
    }

    private int[] sort(int[] input) {
        int[] result = {};

        int pivotElement = input[input.length - 1];

        for (int i = 0; i < input.length - 2; i++) {
            if (input[i] <= pivotElement) {

            }
        }


        return result;
    }

    public static void main(String[] args) {
        int[] input = {12, 4, 13, 7, 15, 5};
        QuickSort qs = new QuickSort();
        qs.sort(input);
    }


}
