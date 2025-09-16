import java.io.FileNotFoundException;
import java.io.FileReader;

public class ffinaally {

    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("test.txt");
            } 
        catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
            } 
        finally {
            System.out.println("This block always executes");
        }
    }

}
