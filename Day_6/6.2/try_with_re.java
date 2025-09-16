import java.io.*;

public class try_with_re {
        public static void main(String[] args) {
        try (FileReader file = new FileReader("test.txt");
             BufferedReader reader = new BufferedReader(file)) {
            
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            
        } catch (IOException e) {
            System.out.println("IO Exception: " + e.getMessage());
        }
    
    }
}
