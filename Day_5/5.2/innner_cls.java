abstract class Outer{
    abstract public void study();
    abstract class matrial{
        public void sub(){
            System.out.println("Maths");
        }
    }
} 
 
abstract class subject extends Outer{
    @Override
    public void study(){
        System.out.println("Examination");
    }
}

public class innner_cls {
    public static void main(String[] args) {
        Outer pri = new subject() {};
        pri.study();
        Outer.matrial ns = pri.new matrial() {}; 
        ns.sub();
    }

    
}
