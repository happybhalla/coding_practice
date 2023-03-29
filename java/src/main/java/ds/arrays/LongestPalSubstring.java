package ds.arrays;

public class LongestPalSubstring {
    public static String longestPalSubstring(String s) {
        /*
         If length of given string is n then its length after
         inserting n+1 "#", one "@", and one "$" will be
         (n) + (n+1) + (1) + (1) = 2n+3
        */
        int strLen = 2 * s.length() + 3;
        char[] sChars = new char[strLen];

        /*
         Inserting special characters to ignore special cases
         at the beginning and end of the array
         "abc" -> @ # a # b # c # $
         "" -> @#$
         "a" -> @ # a # $
        */
        sChars[0] = '@';
        sChars[strLen - 1] = '$';
        int t = 1;
        for (char c : s.toCharArray()) {
            sChars[t++] = '#';
            sChars[t++] = c;
        }
        sChars[t] = '#';

        int maxLen = 0;
        int start = 0;
        int maxRight = 0;
        int center = 0;
        int[] p = new int[strLen]; // i's radius, which doesn't include i
        for (int i = 1; i < strLen - 1; i++) {
            if (i < maxRight) {
                p[i] = Math.min(maxRight - i, p[2 * center - i]);
            }

            // Expanding along the center
            while (sChars[i + p[i] + 1] == sChars[i - p[i] - 1]) {
                p[i]++;
            }

            // Updating center and its bound
            if (i + p[i] > maxRight) {
                center = i;
                maxRight = i + p[i];
            }

            // Updating ans
            if (p[i] > maxLen) {
                start = (i - p[i] - 1) / 2;
                maxLen = p[i];
            }
        }

        // Returning the longest Palindromic substring
        return s.substring(start, start + maxLen);
    }

    public static void main(String[] args){
        String word = "findnitianhere";
        System.out.println(longestPalSubstring(word));
    }
}
