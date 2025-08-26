//Whole class is a hybrid level inheritence

class Shape{
    int l;
    int b;
    public void printArea(){
        System.out.println(l*b);
    }
}
//single level; inheritence

class Triangle extends Shape{
    public void printArea(int l, int b){
        System.out.println(1/2*l*b);
    }
}
//Multi level inheritence

// class Equilateraltriangle extends Triangle{
//     public void printArea(int l, int b){
//         System.out.println(1/2*l*b);
//     }
// }

//Hierarchial inheritence

class Circle extends Shape{
    int r;
    public void printArea(int r){
        System.out.println(3.14*r*r);
    }
}


public class itheritance {
    public static void main(String[] args) {
        Shape n1= new Shape();
        n1.l=5;       
        n1.b=7;
        n1.printArea();

        Triangle n2= new Triangle();
        n2.l=5;       
        n2.b=7;
        n2.printArea();
        
        // Equilateraltriangle n3= new Equilateraltriangle();
        // n3.l=5;       
        // n3.b=7;       
        // n3.printArea();

        Circle n4 =new Circle();
        n4.r=5;
        n4.printArea();
        }
    
}
