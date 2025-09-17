public class bubble{
    static void main(String[] args) {
        int ary[]={4,5,3,1,9,2};
        int a=0;
        for(int j=ary.length-1;0<j;j--){
            for(int i=0;i<j;i++){
                if(ary[i]<ary[i+1]){
                    a =ary[i];
                    ary[i]=ary[i+1];
                    ary[i+1]=a;
                }
            }
        }
        for(int i :ary){
            System.out.print(i+" ");
        }
    }
}