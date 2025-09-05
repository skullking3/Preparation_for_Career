@FunctionalInterface
interface vehicle{
    int cal(int a , int b);
}
public class finctional_interfacess {
    public static void main(String[] args) {
        vehicle add = (a , b) -> a + b;
        System.out.println(add.cal(4,6));
    }
   
}
