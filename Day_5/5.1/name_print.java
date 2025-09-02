public class name_print{
    public static void printN(String n ,int i){
        // System.out.println(a[i]);
        // i++;
        // printN(a, i);

        if(i==1){
        System.out.println(n);
        return ;
        }
        System.out.println(n);
        printN(n, i-1);
    }
    public static void main(String[] args) {
        // int i =0;
        int i =5;
        // String a[] = {"Ram", "Shayam" , "sita","DSA"};
        String n="Krishna";
        // printN(a,i);
        printN(n, i);
    }
} 
