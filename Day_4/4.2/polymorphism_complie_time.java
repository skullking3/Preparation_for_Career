class Car{
    String name;
    int last_owner;
    public void Info(String name){
        System.out.println(name);
    }
    public void Info(int last_owner){
        System.out.println(last_owner);
    }
    public void Info(String name, int last_owner){
        System.out.println(name+""+last_owner);
    }
}

public class polymorphism_complie_time {
    public static void main(String[] args) {
    Car n1=new Car();
    n1.name ="Bmw";
    n1.last_owner=2;   
    
    n1.Info(n1.name,n1.last_owner);
    }
}
