import java.util.*;

public class int_find_ary{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ary = new int[n];
        System.out.println("enter the array");
        for(int i =0;i<n;i++){
            ary[i]=sc.nextInt();
        }
        // for (int k : ary){
        //     System.out.print(k+", ");
        // }

        int[] hash = new int[13];
        for(int i=0;i<n;i++){
            hash[ary[i]]+=1;
        }    
        System.out.println("enter the element whos sreach in ary");
        int a=sc.nextInt();
        while(a-- !=0){
            int s=sc.nextInt();
            System.out.print(hash[s]+", ");
        }
    }
}