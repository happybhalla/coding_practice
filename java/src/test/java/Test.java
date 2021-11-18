
import java.util.*;

 class Empl{
     private Integer id;
     private String name;

     public Empl(Integer id) {
         this.id = id;
     }

     @Override
     public int hashCode() {
         return 1;
     }

     @Override
     public boolean equals(Object obj) {
         Empl emp= (Empl)obj;
         if(emp.id == this.id){
             return false;
         }else {
             return false;
         }

     }
 }

public class Test {

    public static void main(String[] args) {
    Map<Empl,Empl> mp = new HashMap<>();
        Empl em =  new Empl(1);
        Empl em2 =  new Empl(1);

    mp.put(em,em);
    mp.put(em2,em2);

    System.out.println(mp.size());

    }
}
