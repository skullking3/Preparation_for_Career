public class string_example {
    public static void main(String[] args) {
        //Java Strings:-
        // Strings are used for storing text.
        // A String variable contains a collection of characters surrounded by double quotes.


        String a= ("ram aur krishna they are both is hindu god ");
        String s =("Shree");
        

        System.out.println(a);
        System.out.println(a.length());
        System.out.println(a.indexOf("both"));
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        //concatenation '+'
        System.out.println(s+" "+a);
        System.out.println(s.concat(a));



        String[] v={"ram","krishna"};
        for(String i : v){
            System.out.println(i);
        }




    }
}
