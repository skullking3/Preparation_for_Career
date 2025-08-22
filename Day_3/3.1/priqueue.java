import java.util.*;

public class priqueue {
    public static void main(String[] args) {

        Queue<Integer> jn = new PriorityQueue<>();
        
        jn.add(15);
        jn.add(1);
        jn.add(7);
        jn.add(3);

        System.out.println(jn);

        System.out.println("Priority Queue order: ");
        while(!jn.isEmpty()){
            System.out.println(jn.poll());
        }
        
    }
    
}
