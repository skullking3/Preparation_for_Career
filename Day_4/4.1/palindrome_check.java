import java.util.*;

public class palindrome_check {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int a = n;
        int r =0 ;
        int o ;
        while(0<n){
            o = n%10;
            r = (r*10)+o;
            n=n/10;
        }
        System.out.println("That are revers number "+r);
        if(a==r){
            System.out.println("that are palindrome number : "+a);
        }
        else{
            System.out.println("That are not a palindrome number : "+ a +" "+r);
        }
    }
    
}
