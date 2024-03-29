package ds.arrays;

public class CountFrequency
{
    // Function to find counts of all elements present in
    // arr[0..n-1]. The array elements must be range from
    // 1 to n
    void printfrequency(int arr[], int n)
    {
        // Subtract 1 from every element so that the elements
        // become in range from 0 to n-1
        //for (int j = 0; j < n; j++)
         //   arr[j] = arr[j] - 1;

        // Use every element arr[i] as index and add 'n' to
        // element present at arr[i]%n to keep track of count of
        // occurrences of arr[i]
        for (int i = 0; i < n; i++) {
            arr[arr[i] % n] = arr[arr[i] % n] + n;
            System.out.println(i +"");
        }
        // To print counts, simply print the number of times n
        // was added at index corresponding to every element
        for (int i = 1; i < n; i++)
            System.out.println(i  + "->" + arr[i] / n);
    }

    // Driver program to test above functions
    public static void main(String[] args)
    {
        CountFrequency count = new CountFrequency();
        int arr[] = {1,1,1,2,3};
        int n = arr.length;
        count.printfrequency(arr, n);
    }
}

// This code has been contributed by Mayank Jaiswal
