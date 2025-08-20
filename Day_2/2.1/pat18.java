public class pat18 {
    public static void main(String[] args) {
        int i,n=4;
        for(i=0;i<n;i++){
            for(char a=(char)(int)('A'+n-1-i);a<=(char)(int)('A'+n-1);a++){
                System.out.print(a+" ");
            }
            System.out.println(" ");
        }
    }
    
}
