import java.util.*;


public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> ar1 = new HashSet<>(6,0.50f);
        HashSet<Integer> ar2 = new HashSet<>();

         //Starting new array list
        ar1.add(1);
        ar1.add(5);
        ar1.add(4);
        ar1.add(7);
        ar1.add(5);

        //Starting new array list
        ar2.add(15);
        ar2.add(19);
        ar2.add(27);
        ar2.add(99);

        System.out.println(ar1);

        
        //operation perform on arraylist

        // ar1.addAll(0,ar2);
        // ar1.remove(3);
        // ar1.clear();
        // System.out.println(ar2.contains(27));
   

        // for(int i=0;i<=ar1.size();i++){
        //     System.out.println(ar1.next(i));
        //}


        

    }
    
}
