import java.util.*;

public class set{
    public static void main(String[] args){
        Set<Integer> ha = new HashSet<Integer>();
        ha.add(41);
        ha.add(43);
        ha.add(41);//its not run in set interface
        ha.add(47);
        ha.add(413);
        for(int a : ha){
            System.out.println(a);
        }
    }

}