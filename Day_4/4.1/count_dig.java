import java.util.*;


public class count_dig{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        while(0<n){
            n=n/10;
            a=a+1;
        }        
        System.out.println(a);
    }
}