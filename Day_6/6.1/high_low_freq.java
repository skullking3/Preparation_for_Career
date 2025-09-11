import java.util.Scanner;

public class high_low_freq {
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
        boolean t[]=new boolean[n];
        int max=0,min=n;
        int mmax=0,minn=0;
        for(int i=0;i<n;i++){
            if(t[i]==true)
                continue;

            int x=1;
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    t[j]=true;
                    x++;
                }
            }
            if(x>max){
                mmax=a[i];
                max=x;
            }
            if(x<min){
                minn=a[i];
                min=x;
            }   
        }
        System.out.println("High frequency :"+mmax);
        System.out.println("Lowest frequency :"+minn);
    }
}
