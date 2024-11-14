public class operators {

    public static void main(String[] args) {

        /*  Binary operators    */
        int a = 4;
        int b = 2;

        int c = a + b;      // Addition
        int d = a - b;      // Subtraction
        int e = a * b;      // Multiplication
        int f = a / b;      // Division

        int g = 3 % 2;      // Modulus


        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

        float z = (float)a/(float)b;
        System.out.println(z);

        /* Unary operators */

        // Increment
        int w = 5;

        w++; //  Post increment
        System.out.println(w);

        ++w; // Pre increment
        System.out.println(w);


        // Decrement
        int q = 5;

        q--; //  Post Decrement
        System.out.println(q);

        --q; // Pre Decrement
        System.out.println(q);

    }
}