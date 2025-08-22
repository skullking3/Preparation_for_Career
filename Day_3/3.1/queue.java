import java.util.*;

public class queue {
    public static void main(String[] args) {
        //creating queue using a linkedlist
        Queue<Integer> nw = new LinkedList<>();

        nw.add(15);
        nw.add(48);
        nw.offer(42); //one more allternative to add in queue

        System.out.println("Queue"+ nw);

        // int f = nw.remove();
        // System.out.println(f);

        // int a =nw.peek();
        // System.out.println(a);

        System.out.println(nw.isEmpty());

        System.out.println(nw.size());

    }
    
}
