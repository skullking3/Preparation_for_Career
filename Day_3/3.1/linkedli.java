import java.util.*;

public class linkedli {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        l1.add(5);
        l1.add(6);
        l1.add(14);
        l1.add(6);
        l1.add(3,16);
        
        
        l2.add(55);
        l2.add(454);
        l2.add(789);
        l2.add(978);


        // l1.addAll(l2);
        // l1.remove(2);
        // l1.removeAll(l2);
        // l1.clear();
        System.out.println(l1.contains(14));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(16));
        l1.set(1,48);


        for(int i =0;i<=l1.size();i++){
            System.out.println(l1.get(i));
        }
        
    }
}
