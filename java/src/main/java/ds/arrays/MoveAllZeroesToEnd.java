package ds.arrays;

import java.util.Arrays;

public class MoveAllZeroesToEnd {
    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 0, 0, 3, 4, 5, 0, 4, 3, 0, 5, 0};

        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {
                count++;
                continue;
            }

            arr[i - count] = arr[i];
        }

        for (int i = arr.length - 1; i > arr.length - 1 - count; i--) {
            arr[i] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }
}
