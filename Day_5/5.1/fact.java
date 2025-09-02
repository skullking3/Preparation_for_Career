import java.util.*;

public class fact{
     //method using program
    // public static void sumN(int a ,int n){
    //     if(n>=1)
    //     {
    //         a=a*n;
    //         n--;
    //         sumN(a, n);
    //     }
    //     else{
    //         System.out.println(a);
    //     }
    // }

    //recursive using program
    static int fcto(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n * fcto(n-1);        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        try (Scanner sc = new Scanner(System.in)) {
            int n= sc.nextInt();
            System.out.println("The Factorial of; "+n+" is "+fcto(n));
        }
    }
}