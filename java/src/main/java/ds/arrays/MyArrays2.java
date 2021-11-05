package ds.arrays;
import java.io.*;
import java.util.*;

public class MyArrays2 {
    public static void main(String[] args) {
        System.out.println("My 2nd prog");

        List<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        // ArrayList to Array Conversion
        double [] arr = al.stream().mapToDouble(i -> i).toArray();
        OptionalDouble d = al.stream().mapToDouble(i -> i).findFirst();
        System.out.println(d);
        for (double x : arr)
            System.out.print(x + " ");

        Map<String ,String> map = new HashMap<>();
        map.put("A","Z");
        map.put("B","Y");

        for (String key : map.keySet()){
            System.out.println(map.get(key));
           // map.remove("B");
        }

        Iterator<Map.Entry<String,String>> it = map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String, String> entry = it.next();
            System.out.println(" it ="+entry.getValue());
            //map.remove("B");
            it.remove();
            for (String key : map.keySet()){
                System.out.println("test "+map.get(key));
                // map.remove("B");
            }
        }

        for (String key : map.keySet()){
            System.out.println("test "+map.get(key));
            // map.remove("B");
        }
    }

}
