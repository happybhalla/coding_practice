package question;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MinimumRoomRequiredForMeeting {
    public static void main(String[] args) {

        int[][] test = {{0, 30}, {15, 10}, {5, 20}};
        //System.out.println(Arrays.deepToString(test));
        Arrays.sort(
                test,
                (Comparator<int[]>) (o1, o2) -> (o1[0] - o2[0])
        );
        // System.out.println(Arrays.deepToString(test));


        int[] start = {1, 5, 2};
        int[] end = {5, 6, 4};

        int[][] mergeAr = new int[3][2];

        for (int i = 0; i < start.length; i++) {
            mergeAr[i][0] = start[i];
            mergeAr[i][1] = end[i];
        }

        System.out.println(Arrays.deepToString(mergeAr));
        Arrays.sort(mergeAr, (Comparator<int[]>) (o1, o2) -> (o1[1] - o2[1]));

        System.out.println(Arrays.deepToString(mergeAr));
        //System.out.println(Arrays.toString(mergeAr[0]));
        //System.out.println(Arrays.toString(mergeAr[1]));
        // System.out.println(Arrays.deepToString(mergeAr));


        // System.out.println(Arrays.deepToString(mergeAr));
        //System.out.println(Arrays.toString(mergeAr[0]));
        //System.out.println(Arrays.toString(mergeAr[1]));

        int[][] arr = {{0, 30}, {5, 16}, {15, 20}};

        Arrays.sort(arr, (Comparator<int[]>) (o1, o2) -> (o1[0] - o2[0]));

        System.out.println(Arrays.deepToString(arr));

        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        queue.offer(arr[0][1]);

        for (int i = 1; i < arr.length; i++) {
            if (queue.peek() < arr[i][0]) {
                queue.poll();
            }
            queue.offer(arr[i][1]);
        }


        System.out.println(queue.size());


    }
}
