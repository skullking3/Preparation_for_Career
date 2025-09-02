public class sum_of_n {
    
    public static int sumN(int n){
        // if(n<=10)
        // {
        //     a=a+n;
        //     n++;
        //     sumN(a, n);
        // }
        // else{
        //     System.out.println(a);
        // }
        if(n==0){
            return 0;
        }
        return n + sumN(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        // int a=0;
        sumN(n);
        System.out.println(sumN(n));

    }
    
}