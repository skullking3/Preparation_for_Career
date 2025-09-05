interface gadi{
    void start();
    void stop();
}

class Car implements gadi{
    @Override
    public void start(){
        System.out.println("Engine Start");

    }
    @Override
    public void stop(){
        System.out.println("Engine Off");
    }
}
public class normal_interfaces {
    public static void main(String[] args) {
        Car sc = new Car();
        sc.start();
        sc.stop();
    }
    
}
