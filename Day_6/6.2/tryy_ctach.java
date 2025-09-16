public class tryy_ctach {
    public static void main(String[] args) {
        int a[]={10,80,40,70};
        int b[]={1,18,0,7};
        
        for(int i=0;i<a.length;i++){
            System.out.println(div(a[i],b[i]));
        }
    }
    public static int div(int a,int b){
        try{
        return a/b;
    }
        
        catch(Exception q){
            System.out.println(q);
            return -1;
        }
    }
    
}
