package question;

class Knapsack {

    // A utility function that returns
    // maximum of two integers
    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // Returns the maximum value that can
    // be put in a knapsack of capacity W
    static int knapSack(int W, int wt[],
                        int val[], int n) {
        int i, w;
        int K[][] = new int[n + 1][W + 1];

        // Build table K[][] in bottom up manner
        for (i = 0; i <= n; i++) {
            for (w = 0; w <= W; w++) {
                if (i == 0 || w == 0)
                    K[i][w] = 0;
                else if (wt[i - 1] <= w)
                    K[i][w]
                            = max(val[i - 1]
                                    + K[i - 1][w - wt[i - 1]],
                            K[i - 1][w]);
                else
                    K[i][w] = K[i - 1][w];
            }
        }


        return K[n][W];
    }




    public static int knapsack(int n, int W, int wm[], int vm[]) {
        int[][] cost = new int[n+1][W+1];
        for (int w = 0; w <= W; w++) {
            cost[0][w] = 0;
        }

        for (int i = 0; i <= n; i++) {
            cost[i][0] = 0;
        }

        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= W; w++) {
                if (wm[i] > w) {
                    cost[i][w] = cost[i - 1][w];
                } else {
                    if (vm[i] + cost[i - 1][w - wm[i]] > cost[i - 1][w]) {
                        cost[i][w] = vm[i] + cost[i - 1][w - wm[i]];
                    } else {
                        cost[i][w] = cost[i - 1][w];
                    }
                }
            }
        }
        return cost[n][W];
    }


    // Driver code
    public static void main(String args[]) {
        int val[] = new int[]{4, 2, 1, 2, 10};
        int wt[] = new int[]{12, 2, 1, 1, 4};
        int W = 5;
        int n = val.length;


        System.out.println(knapSack(W, wt, val, n));
        int wm[] = {12, 2, 1, 1, 4};//{0, 3, 2, 4, 1};
        int vm[] = {4, 2, 1, 2, 10};//{0, 8, 3, 9, 6};
        //System.out.println(knapsack(4, 5, wm, vm));
        System.out.println(knapsack(4, 5, wm, vm));
    }
}
