public class type_conversion {
    public static void main(String[] args) {
        //Implicit Type Conversion
        int a =14;
        float l=a;
        System.out.println(l);// int automatically converted to float (14 → 14.0)

        // Explicit Type Conversion
        int j=(int)l;
        System.out.println(j);// manually by the programmer using cast operators.

        // Type Promotion
        // Happens when variables of different types are used in the same expression.
        int i=12;
        char q='A';//A byte num 65
        int s=i+q;
        System.out.println(s);//65+12=77


    }
    
}
