public class recursion{
    public static void printS(int n){
        if(n==1){
            System.out.println(1);//Self work
            return;
        }
        printS(n-1); //recusive work
        System.out.println(n);//Bsae Case
        
    }
    public static void main(String[] args) {
        int n=5;
        printS(n);
    }
}