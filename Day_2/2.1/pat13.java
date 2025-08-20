public class pat13 {
    public static void main(String[] args) {
        int i,j,a,n;
        n=4;
        a=1;
        for(i=0;i<n;i++){
            for(j=0;j<=i;j++){
                System.out.print(a+" ");
                a=a+1;
            }
            System.out.println(" ");
        }
    }
    
}
