public class ary_sreach_ele{
    public static void sreachEle(int q ,int n ,int[] a){
        int i=0;
        for(i=0;i<a.length;i++){
            if(q==a[i]){
                n=n+1;
            }         
        }
        System.out.println(n);
    }
    public static void main(String[] args) {
        int a[]={1,5,2,4,2,1};
        int n =0;
        int l =1;
        sreachEle(l,n,a);
    }
}