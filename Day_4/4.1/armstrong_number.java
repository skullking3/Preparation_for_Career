import java.util.*;

public class armstrong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m =n;
        int a = 0;
        int w ,c =0;
        while(0<n){
            a=n%10;
            w=a*a*a;
            c=c+w;
            n=n/10;
        }
        if(c==m){
            System.out.println("that is armstrong Number : "+c);
        }
        else{
            System.out.println("That is not a Armstrong");
        }
        
    }
    
}
// Armstrong number like :- 153 , 407 , 370 , 371