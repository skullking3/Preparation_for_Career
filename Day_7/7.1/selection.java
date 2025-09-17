public class selection {
    public static void main(String[] args) {
        int ary[]={8,4,7,1,6};
        for(int i=0;i<ary.length-1;i++){
            int sml=i;
            for(int j=i+1;j<ary.length;j++){
                if(ary[sml]>ary[j]){
                    sml=j;
                }
            }
            int a = ary[sml];
            ary[sml]=ary[i];
            ary[i]=a;
        }
        for(int i:ary){
            System.out.print(i+" ");
        }
    }
    
}
