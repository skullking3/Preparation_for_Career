import java.util.Stack;

public class stackex {
    public static void main(String[] args) {
        Stack<String> nw = new Stack<>();
        nw.push("Ram");
        nw.push("Krishna");
        nw.push("gita");
        nw.pop();
        nw.push("Gyan");
        nw.pop();

        for(String pri : nw){
            System.out.println(pri);
        }

    }
    
}
