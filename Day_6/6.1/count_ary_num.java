import java.util.*;

public class count_ary_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a =new int[n];
        for (int i =0 ; i<n;i++){
            a[i]=sc.nextInt();
        }
        cont(n,a);
    }
    public static void cont(int n,int[]a){
        // boolean t[]=new boolean[n];
        // for(int i=0;i<n;i++){
        //     if(t[i]==true)
        //         continue;

        //     int x=1;
        //     for(int j=i+1;j<n;j++){
        //         if(a[i]==a[j]){
        //             t[j]=true;
        //             x++;
        //         }
        //     }
        //     System.out.println(a[i]+" "+x);
        // }

        Map<Integer,Integer> m = new HashMap<>();
        for(int i =0;i<n;i++){
            if(m.containsKey(a[i])){
                m.put(a[i],m.get(a[i])+1);
            }
            else{
                m.put(a[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> e:m.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
