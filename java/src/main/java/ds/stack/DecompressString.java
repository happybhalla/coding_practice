package ds.stack;

/**
 * google interview question
 * test case
 * <p>
 * input :- 2[3[a]b]
 * output :-aaabaaab
 * <p>
 * input : 3[abc]4[ab]c
 * output: abcabcabcababababc
 */

import java.util.Scanner;
import java.util.Stack;

public class DecompressString {

    public static String decompress(String input) {
        Stack<Character> inputStack = new Stack<Character>();
        char chCloseB = ']';
        char chOpenB = '[';
        //StringBuffer result = new StringBuffer();
        StringBuffer poputResult = new StringBuffer();
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) != chCloseB ) {
                inputStack.push(input.charAt(i));
            }else {
                char popOut = 0;
                while (popOut != chOpenB ){
                    popOut=inputStack.pop();
                    if(popOut != chOpenB){
                        poputResult.append(popOut);}
                }

                popOut = 0;
                while (popOut != chOpenB) {
                    popOut = inputStack.pop();
                    int val = 0;
                    if (47 < popOut && popOut < 58) {
                         val = Character.getNumericValue(popOut);

                    }

                    for (int va = val; va > 0; va--) {
                        poputResult.append(popOut);
                    }
                }
                poputResult.toString();
                inputStack.push('[');
            }
        }


        return poputResult.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string = ");
        String input = sc.nextLine();
        decompress(input);

    }

}
