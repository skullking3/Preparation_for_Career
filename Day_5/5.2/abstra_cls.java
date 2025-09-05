
    abstract class animal{
        public abstract void voice();
        public abstract void legs();
    }

    abstract class Dog extends animal{
        @Override
        public void voice(){
            System.out.println("Dog:-Bow Bow");
        }
        @Override
        public void legs(){
            System.out.println("Four Legs are there");
        }
    }

    abstract class cat extends animal{
        @Override
        public void voice(){
            System.out.println("Cat :- Meow Meow");
        }
        @Override
        public void legs(){
            System.out.println("Four legs");
        }
    }
public class abstra_cls{   
     public static void main(String[] args) {
        animal mal = new Dog() {};
        mal.voice();
        mal.legs();
        
        cat cs = new cat() {};
        cs.voice();
        cs.legs();
        
    }
}































// // Functional interface annotation (optional but recommended)
// @FunctionalInterface
// interface Calculator {
//     // Single abstract method
//     int calculate(int a, int b);
    
//     // Default methods are allowed
//     default void displayResult(int result) {
//         System.out.println("Result: " + result);
//     }
    
//     // Static methods are allowed
//     static String getOperationName() {
//         return "Calculation";
//     }
// }

// // Using lambda expressions with functional interfaces
// public class FunctionalInterfaceDemo {
//     public static void main(String[] args) {
//         // Lambda implementation
//         Calculator addition = (a, b) -> a + b;
//         Calculator multiplication = (a, b) -> a * b;
        
//         System.out.println("Addition: " + addition.calculate(5, 3));
//         System.out.println("Multiplication: " + multiplication.calculate(5, 3));
        
//         // Using method reference
//         Calculator subtraction = FunctionalInterfaceDemo::subtract;
//         System.out.println("Subtraction: " + subtraction.calculate(5, 3));
        
//         // Using anonymous class (old way)
//         Calculator division = new Calculator() {
//             @Override
//             public int calculate(int a, int b) {
//                 return a / b;
//             }
//         };
//         System.out.println("Division: " + division.calculate(10, 2));
//     }
    
//     private static int subtract(int a, int b) {
//         return a - b;
//     }
// }