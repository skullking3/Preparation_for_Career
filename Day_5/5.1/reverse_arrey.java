public class reverse_arrey {
    public static void rev_ary(int ary[],int st, int end){
        if(st>=end){
            for(int i : ary){
            System.out.print(i+",");
            }
            return;
        }

        int temp =ary[st];
        ary[st]=ary[end];
        ary[end]=temp;


        rev_ary(ary, st+1, end-1);
        
        
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        System.out.print("Original Array : ");
        for(int n:a){
            System.out.print(n+",");
        }
        System.out.println(" ");
        System.out.print("Reversed Array : ");
        rev_ary(a, 0, a.length-1);
       
        // System.out.println("reversed array"+ java.util.Arrays.toString(a));
    }
    
}
