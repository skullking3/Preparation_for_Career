import java.util.*;


public class linkedhashset {
    public static void main(String[] args) {
        LinkedHashSet<Integer> sc = new LinkedHashSet<>(50,.24f);
        sc.add(15);
        sc.add(75);
        sc.add(19);
        sc.add(1);

        System.out.println(sc);
    }
}
