package question;

import java.util.*;
public class Twillio {

    public static int subarraysDivByK(int[] A, int K) {
        int sum = 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < A.length; i++) {
            sum = (sum + A[i]) % K;
            if (sum < 0) {
                sum += K;
            }
            count += map.getOrDefault(sum, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public  static List<Integer> ite(List<Integer> it){

        Map<Integer,Integer> data = new HashMap<>();

        for (Integer i :it){
            if(data.containsKey(i)){
                Integer val = data.get(i) ;
                val ++;
                data.put(i,val);


            }else {
                data.put(i,1);
            }
        }

        List<Integer> SingleList = new ArrayList<>();
        List<Integer> duplicateList = new ArrayList<>();

        for (Integer key : data.keySet()){
            Integer value = data.get(key);
            if(value==1){
                SingleList.add(key);
            }else {
                while (value >0) {
                    duplicateList.add(key);
                    value--;
                }
                }
            }
        Collections.sort(SingleList);
        Collections.sort(duplicateList);

        List<Integer> res = new ArrayList<>();
        for (Integer i: SingleList
             ) {
            res.add(i);
        }
        for (Integer i:duplicateList){
            res.add(i);
        }




    return res;
    }
    public static void main(String[] args) {




        //int k = 3;
        //System.out.println(subarraysDivByK(arr,k));
        List<Integer> it = new ArrayList<>();
        it.add(4);
        it.add(5);
        it.add(6);
        it.add(5);
        it.add(4);
        it.add(3);

        ite(it);

    }
}
