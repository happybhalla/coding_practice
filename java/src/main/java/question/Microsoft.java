package question;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Microsoft {


    /**
     * @param maxIteration
     * @return    /**
     *          * Based on the following fuzzy question @ StackOverflow
     *          * http://stackoverflow.com/questions/7571934/printing-numbers-of-the-form-2i-5j-in-increasing-order
     *          *
     *          *
     *          * Result:
     *          * 1 2 4 5 8 10 16 20 25 32 40 64 80 100 125 128 200 256 400 625 1000 2000 10000
     *
     */
        private static Integer findIncreasingNumbers(int maxIteration) {
            SortedSet<Integer> numbers = new TreeSet<Integer>();
            SortedSet<Integer> numbers2 = new TreeSet<Integer>();

            for (int i=0;i < maxIteration;i++) {
                int n1 = (int)Math.pow(2, i);
                numbers.add(n1);

                for (int j=0;j < maxIteration;j++) {
                    int n2 = (int)Math.pow(3, i);
                    numbers.add(n2);

                    for (Integer n: numbers) {
                        int n3 = n*n1;
                        numbers2.add(n3);
                    }
                }
            }

            numbers.addAll(numbers2);

            List<Integer> l1= new ArrayList<Integer>(numbers);

            return  l1.get(maxIteration);
        }

    /**
     * @param num Find the Smallest number/largest (Not leading Zeros) which can be obtained by rearranging the digits of a given number.
     * @return
     */
        static int smallest(int num)
        {
            // initialize frequency of each digit to Zero
            int[] freq = new int[10];

            // Checking Number is positive or Negative
            boolean is_pos = (num>0);

            // Getting the absolute value of num
            num = Math.abs(num);

            // count frequency of each digit in the number
            while (num > 0)
            {
                int d = num % 10; // extract last digit
                freq[d]++; // increment counting
                num = num / 10; //remove last digit
            }

            int result = 0;

            // If it is positive Number then it should be smallest
            if(is_pos)
            {
                // Set the Rightmost digit to maximum
                for (int i = 9 ; i >= 1 ; i--)
                {
                    if (freq[i] !=0)
                    {
                        result = i;
                        freq[i]--;
                        break;
                    }
                }

                // arrange all remaining digits
                // in descending order
                for (int i = 9 ; i >=0 ; i--)
                    while (freq[i]-- != 0)
                        result = result * 10 + i;

                // Negative number should be returned here
                result = result;

            }
            else // If negative then number should be Largest
            {
                // Set the Rightmost digit to maximum
                for (int i = 9 ; i >= 1 ; i--)
                {
                    if (freq[i] !=0)
                    {
                        result = i;
                        freq[i]--;
                        break;
                    }
                }

                // arrange all remaining digits
                // in descending order
                for (int i = 9 ; i >=0 ; i--)
                    while (freq[i]-- != 0)
                        result = result * 10 + i;

                // Negative number should be returned here
                result = -result;
            }
            return result;
        }


        public static void main(String[] args) {
            Integer numbers = findIncreasingNumbers(4);

            System.out.println(numbers);
        }
    }


