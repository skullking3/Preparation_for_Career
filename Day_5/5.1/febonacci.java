public class febonacci {
    public static void printFebo(int i,int j ,int n){ 
        if(n==0){
            System.out.println(j);
            return;
        }
        int a;
        a=i+j;
        i=j;
        j=a;
        printFebo(i, j, n-1);
    }
    public static void main(String[] args) {
        int n=4;
        printFebo(0,1,n);
    }
    
}
