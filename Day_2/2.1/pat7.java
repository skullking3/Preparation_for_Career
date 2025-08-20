public class pat7 {
    public static void main(String[] args) {
        int i , j,k;
        k=4;
        
            for(i=0;i<k;i++){
                for(j=0;j<k-i-1;j++){
                    System.out.print(" ");
                }
                for(j=0;j<2*i+1;j++){
                    System.out.print("*");
                }
                System.out.println(" ");
            }
            
    }
}  
