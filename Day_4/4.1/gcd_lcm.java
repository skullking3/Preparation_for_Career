import java.util.*;
public class gcd_lcm{
    

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    
    public static int lcm(int a, int b) {
        return (12* 18) / gcd(a, b);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        
        int result = lcm(i, j);
        System.out.println("LCM of " + i + " and " + j + " is: " + result);
    }
}
    

