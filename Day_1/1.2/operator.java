public class operator {
    public static void main(String[] args) {
        //Arithmetic oprators like " +,-,*,/,% "
        //Arithmetic Operators are used to perform simple arithmetic operations
        int a =5;
        int b =3;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        // //Unary Operators like "--" in postdecrement and predecrement,"++" in postincrement and preincrement
        // //Unary Operators need only one operand. They are used to increment, decrement, or negate a value
        a=50;
        b=60;
        System.out.println("postincrement ="+ (a++));
        System.out.println("preincrement ="+ (++a));
        System.out.println("postdecrement ="+ (a--));
        System.out.println("predecrement ="+ (--a));

        // //Assignment operators like  " +=.-=,*=,/=,%= "
        // //The assignment operator is used to assign a value to any variable. It has right-to-left associativity
        int f = 7;
        System.out.println("f += 3: " + (f += 3));
        System.out.println("f -= 2: " + (f -= 2));
        System.out.println("f *= 4: " + (f *= 4));
        System.out.println("f /= 3: " + (f /= 3));
        System.out.println("f %= 2: " + (f %= 2));
        System.out.println("f &= 0b1010: " + (f &= 0b1010));
        System.out.println("f |= 0b1100: " + (f |= 0b1100));
        System.out.println("f ^= 0b1010: " + (f ^= 0b1010));
        System.out.println("f <<= 2: " + (f <<= 2));
        System.out.println("f >>= 1: " + (f >>= 1));
        System.out.println("f >>>= 1: " + (f >>>= 1));


        // //Java Comparison Operators "==,<=,>=,!=,<,>"
        // //Comparison operators are used to compare two values (or variables).
        int i=41;
        int j=62;
        System.out.println(i==j);
        System.out.println(i!=j);
        System.out.println(i<j);
        System.out.println(i>j);
        System.out.println(i<=j);
        System.out.println(i>=j);

        // //Java Logical Operators like " &&,||,!".
        // //Logical operators are used to determine the logic between variables or values:
        int k=14;
        int y=62;
        System.out.println(k>23&&y>4);
        System.out.println(k>4||y>63);
        System.out.println(!(k>2&&y>3));

        //Ternary operator like
        //The Ternary Operator is a shorthand version of the if-else statement. 
        //It has three operands and hence the name Ternary.
        int q,h,l;
        q=74;
        h=54;
        l=(q>h)? q:h;
        System.out.println(l);

        //Bitwise Operators
        //Bitwise Operators are used to perform the manipulation of individual bits of a number and with any of the integer types
        int u=0b0110;
        int o=0b0100;
        System.out.println(u&o);
        System.out.println(u|o);
        System.out.println(u^o);
        System.out.println(~o);
    }
}
