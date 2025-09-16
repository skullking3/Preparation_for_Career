
public class multi_ctach{
    public static void main(String[] args) {
        try {
    int[] numbers = {1, 2, 3};
    System.out.println(numbers[5]);
    int result = 10 / 0;
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Array index out of bounds: " + e.getMessage());
    } catch (ArithmeticException e) {
        System.out.println("Arithmetic error: " + e);
    } catch (Exception e) {
        System.out.println("General exception: " + e.getMessage());
    }   
    }
    
}
