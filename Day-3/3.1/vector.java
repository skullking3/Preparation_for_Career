import java.util.*;

public class vector {
    public static void main(String[] args) {
       

        //creating object for arraylistle
        Vector<Integer> ar1 = new Vector<>();
        Vector<Integer> ar2 = new Vector<>();

        //Starting new array list
        ar1.add(1);
        ar1.add(5);
        ar1.add(4);
        ar1.add(7);
        ar1.add(5);
        ar1.add(1, 60);

        //Starting new array list
        ar2.add(15);
        ar2.add(19);
        ar2.add(27);
        ar2.add(99);
        
        //operation perform on arraylist

        // ar1.addAll(0,ar2);
        // ar1.remove(3);
        // ar1.removeAll(ar2);
        // ar1.clear();
        // System.out.println(ar2.contains(27));
        // System.out.println(ar1.indexOf(7));
        // System.out.println(ar1.lastIndexOf(5));
        ar1.set(2,52);
   

        for(int i=0;i<=ar1.size();i++){
            System.out.println(ar1.get(i));


        }

    }
}