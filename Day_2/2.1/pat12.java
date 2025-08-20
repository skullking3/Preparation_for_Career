public class pat12 {
    public static void main(String[] args) {
        int i,j,k,n;
        n=4;
        k=3;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("*"); 
            }
            for(j=0;j<2*k;j++){
                System.out.print(" ");
            }
            for(j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println(" ");
            k--;
        }
    }
    
}
