public class Insertion {
    public static void main(String[] args) {
        int ary[]={5,9,1,6,4};

        for(int i =1;i<ary.length;i++){
            int a = ary[i];
            int j = i-1;
            while (j>= 0 && a<ary[j]) {
                ary[j+1]=ary[j];
                j--;
            }
            ary[j+1]=a;
        }
        for(int i :ary){
            System.out.print(i+" ");
        }
    }    
}
