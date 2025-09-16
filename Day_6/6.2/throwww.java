public class throwww {
    public static void validateAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Age must be 18 or older");
        } else {
            System.out.println("Age is valid");
        }
    }
    
    public static void main(String[] args) {
        try {
            validateAge(16); // This will throw an exception
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}