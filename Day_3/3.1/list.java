import java.util.*;

public class list {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(28);
        num.add(42);
        num.add(1);
        num.add(23);
num.add(15);
        num.add(19);
        num.add(27);
        num.add(99);
        
        //operation perform on arraylist

        // num.addAll(0,ar2);
        // num.remove(3);
        // num.removeAll(ar2);
        // num.clear();
        // System.out.println(num.contains(27));
        // System.out.println(num.indexOf(7));
        // System.out.println(num.lastIndexOf(5));
        num.set(2,52);
   

        for(int i:num){
            System.out.println(num.get(i));


        }

    }
    
}
