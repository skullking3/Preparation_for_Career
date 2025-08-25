import java.util.*;

public class reverse_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r =0;
        int a;
        while(0<n){
            a=n%10;
            r= (r*10)+a;
            n= n/10;
        }
        System.out.println(r);
    }
    
}
