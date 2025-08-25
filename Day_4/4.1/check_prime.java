import java.util.*;

public class check_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("Its not a prime Number divisors by 2");
        }
        else if(n%3==0){
            System.out.println("Its not a prime Number divisors by 3");

        }
        else{
            System.out.println("its prime number "+n);
        }
    }
    
}
