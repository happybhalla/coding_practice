package ds.arrays;

import java.util.*;

/*
For example: "Today, is the greatest day ever!" should return
 * greatest because it has 2 e's (and 2 t's)
 */
public class FirstMaxRepeatedLetter {

    private static String MaxLetter(String str){

        String[] words  = str.split(" ");
        Map<Integer,String> res = new TreeMap<Integer, String>(Collections.reverseOrder());
        for(String word : words){
            Set<Character> letterSet = new HashSet<Character>();
            Set<Character> letterAdd = new HashSet<Character>();
            int lcount  = 0;
            for ( int i = 0 ;i<word.length()-1;i++){
                System.out.println(word);
                if (letterSet.contains(word.charAt(i))){
                    letterAdd.add(word.charAt(i));

                }else {
                    letterSet.add(word.charAt(i));
                }


            }
            if(letterAdd.size()>0){
                if(!res.containsKey(letterAdd.size()) )
                  res.put(letterAdd.size(),word);
            }else {
                continue;
            }

        }

        for (Map.Entry<Integer,String> entry : res.entrySet()){
            return entry.getValue();

        }


     return "-1";
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String line = sc.nextLine();

        MaxLetter(line);

    }
}
