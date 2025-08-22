import java.util.*;

public class deque {
    public static void main(String[] args) {
         Queue<Integer> h = new ArrayDeque<>();

         //put the in queue
         h.offer(42);
         h.offer(45);
         h.offer(75);

         System.out.println(h);

         while(!h.isEmpty()){
            System.out.println(h.poll());
         }
    }
    
}
