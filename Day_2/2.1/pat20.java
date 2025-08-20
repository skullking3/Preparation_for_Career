public class pat20 {
    public static void main(String[] args) {
        int i,j,n,k;
        n=4;
        k=n-1;
        for(i=0;i<n;i++){
            for(j=0;j<=i;j++){
                System.out.print("*");
            }
            for(j=0;j<2*k;j++){
            System.out.print(" ");
            }
            for(j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
            k--;
        }
        k=0;
        for(i=0;i<n;i++){
            for(j=n;j>i;j--){
                System.out.print("*");
            }
            for(j=0;j<2*k;j++){
                System.out.print(" ");
            }
            for(j=n;j>i;j--){
                System.out.print("*");
            }
            System.out.println(" ");
            k++;
        }
    }
    
}
