

// class Bike{
//     int no;
//     String nam;
//     String whl1;

//     public void print(){
//         System.out.println("This is bike information");
//     }
//     public void number(){
//         System.out.print(this.no+" ");
//     }
//     public void name(){
//         System.out.print(this.nam+" ");
//     }
//     public void wheel(){
//         System.out.print(this.whl1);
//         System.out.println(" ");
//     }
// }

class Car{
    String na;
    int sheeter;

    public void printInfo(){
        System.out.println("Name "+this.na);
        System.out.println(this.sheeter+" Sheeter");
    }
    //Non-Parameterized Constructor
    // Car(){
    //     System.out.println("This is Car Information");
    // }

    //parameterized Constructor
    // Car(String a ,int b){
    //     this.na =a;
    //     this.sheeter=b;
    // }

    //copy Constructor
    Car(Car n4){
        this.na=n4.na;
        this.sheeter=n4.sheeter;
    }
    //this Constructor only used for n3
    Car(){

    }
}

public class clas_obj {
    public static void main(String[] args) {   
        // Bike n1 = new Bike();//bike() is Constructor //new is keyword that creat the heap in storage  
        // n1.no=1;
        // n1.nam="Hero";
        // n1.whl1="2_wheeler";

        // Bike n2 = new Bike();
        // n2.no=2;
        // n2.nam="Honda";
        // n2.whl1="3_wheeler";

        // n1.number();
        // n1.name();
        // n1.wheel();

        // n2.number();
        // n2.name();
        // n2.wheel();

        Car n3 = new Car();
        n3.na="BMW";
        n3.sheeter=4;
        n3.printInfo();


        //parameterized Constructor call
        // Car n3 = new Car("BMW",4);
        // n3.printInfo();

        //copy constructor
        Car n4 = new Car(n3);
        n4.printInfo();

}
}