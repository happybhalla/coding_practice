package ds.arrays;

public class RainWaterHarvesting {


    public static int getWaterHarvested(int[] input) {
        int prev_max = input[0];
        int prev_index = 0;

        int water = 0;
        int temp = 0;

        for (int i = 1; i < input.length; i++) {

            if (input[i] >= prev_max) {
                prev_max = input[i];
                prev_index = i;
                temp = 0;
            } else {

                water += (prev_max - input[i]);
                temp += (prev_max - input[i]);
            }

        }
        if (prev_index < input.length - 1) {
            water -= temp;
            prev_max = input[input.length - 1];
            for (int i = input.length - 1; i > prev_index; i--) {

                if (input[i] >= prev_max) {
                    prev_max = input[i];

                } else {
                    water += (prev_max - input[i]);
                }
            }
        }

        return water;
    }

    public static int getWaterHarvestedByPointer(int[] input) {
        int l_max = 0;
        int r_max = input[input.length - 1];
        int l = 0;
        int r = input.length - 1;
        int water = 0;


        while (l <= r) {

            if (l_max >= r_max) {
                water += Math.max(0, r_max - input[r]);
                r_max += Math.max(r_max, input[r]);
                r--;
            } else {
                water += Math.max(0, l_max - input[l]);
                l_max += Math.max(l_max, input[l]);
                l++;
            }
        }


        return water;
    }

    public static void main(String[] args) {
        int arr[] = {2, 0, 2};

        System.out.println(getWaterHarvested(arr));

        System.out.println(getWaterHarvestedByPointer(arr));
    }
}
