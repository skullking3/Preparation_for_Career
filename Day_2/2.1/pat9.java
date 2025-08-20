public class pat9 {
    public static void main(String[] args) {
        int i,j,k;
        k=5;
        for(i=0;i<k;i++){
                for(j=0;j<k-i-1;j++){
                    System.out.print(" ");
                }
                for(j=0;j<2*i+1;j++){
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        k=0;
        for(i=4;i>=k;i--){
                for(j=4;j>=i+1;j--){
                    System.out.print(" ");
                }
                for(j=0;j<2*i+1;j++){
                    System.out.print("*");
                }
                
                
                
                System.out.println(" ");
            }
    }
    
}
