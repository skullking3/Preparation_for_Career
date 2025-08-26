// without interface
abstract class Animal{
    public void walk(){
    } 

     Animal() {
            System.out.println("Walk in 4 Legs");
        }

}

class Horse extends Animal{
    Horse(){
            System.out.println("Always is tall in height");
    }
    public void walk(){
        System.out.println("Horse is fast runner");
    }
}

class Chicken extends Animal{
    public void used(){
        System.out.println("Chicken is used for producing eggs");
    }
}

public class absstract {
    public static void main(String[] args) {
        Horse n1=new Horse();
        n1.walk();

        // Chicken n2 = new Chicken();
        // n2.used();

        // Animal n3 = new Animal();
        // n3.walk();
    }
}
