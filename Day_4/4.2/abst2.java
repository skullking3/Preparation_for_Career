interface Animal{
    int i =2;
    public void walk();
}
interface Goods{
    public default void printinfo(){
        System.out.println("Animals");
    }
}
class Horse implements Animal,Goods{//multiple interface using by inhertence
    public void walk(){
        System.out.println("Walk in four legs");
    }
}
public class abst2 {
    public static void main(String[] args) {
        Horse n1 = new Horse();
        n1.walk();
        n1.printinfo();
    }
    
}
