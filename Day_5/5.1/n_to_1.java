import java.util.Scanner;

public class n_to_1 {
    public static void print(int a){
        // if(1<=a){
        //     System.out.println(a);
        //     a--;
        //     print(a);

        // }
        if(a==0){
            return;
        }
        System.out.println(a);
        print(a-1);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a=sc.nextInt();
            print(a);
        }
    }
    
}
