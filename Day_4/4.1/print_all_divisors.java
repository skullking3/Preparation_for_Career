import java.util.*;

public class print_all_divisors {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            if(n%i == 0 ){
                a.add(i);
            }
        }
        for(int j :a){
            System.out.println(j);
        }
        
    }
    
}
