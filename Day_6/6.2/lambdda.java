@FunctionalInterface
interface Inneambdda {
    int cal(int a,int b);   
}

public class lambdda {
    public static void main(String[] args) {
        Inneambdda vod =(a,b) -> {System.out.println(a+b);
        return 0;};
        vod.cal(10,5);




        Anoy ns =new Anoy(){
            public void pri1(){
                System.out.println("hello");
            }
        };
        ns.pri1();
    }
}