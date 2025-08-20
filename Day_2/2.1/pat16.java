public class pat16 {
    public static void main(String[] args) {
        char a='A';

        for(int i=0;i<4;i++){
            for(int j=0;j<=i;j++){
                
                System.out.print((char)(int)(a+i));
            }
            System.out.println(" ");
        }
    }
    
}
