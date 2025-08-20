public class pat8 {
    public static void main(String[] args) {
        int i,j,k; 
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
