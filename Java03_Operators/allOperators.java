// File name: OperatorsExample.java
public class allOperators { 
    public static void main(String[] args) {
        // 1. Arithmetic Operators
        int a = 10;
        int b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus

        // 2. Unary Operators
        int x = 10;
        System.out.println("\nUnary Operators:");
        System.out.println("x = " + x);
        System.out.println("x++ = " + (x++)); // Post-increment
        System.out.println("++x = " + (++x)); // Pre-increment
        System.out.println("x-- = " + (x--)); // Post-decrement
        System.out.println("--x = " + (--x)); // Pre-decrement

        // 3. Assignment Operators
        int c = 15;
        System.out.println("\nAssignment Operators:");
        System.out.println("c = " + c);
        c += 5; // c = c + 5
        System.out.println("c += 5: " + c);
        c -= 3; // c = c - 3
        System.out.println("c -= 3: " + c);
        c *= 2; // c = c * 2
        System.out.println("c *= 2: " + c);
        c /= 4; // c = c / 4
        System.out.println("c /= 4: " + c);
        c %= 3; // c = c % 3
        System.out.println("c %= 3: " + c);

        // 4. Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // 5. Logical Operators
        boolean condition1 = true;
        boolean condition2 = false;
        System.out.println("\nLogical Operators:");
        System.out.println("condition1 && condition2: " + (condition1 && condition2));
        System.out.println("condition1 || condition2: " + (condition1 || condition2));
        System.out.println("!condition1: " + (!condition1));

        // 6. Bitwise Operators
        int bitwiseA = 5; // 0101 in binary
        int bitwiseB = 3; // 0011 in binary
        System.out.println("\nBitwise Operators:");
        System.out.println("bitwiseA & bitwiseB: " + (bitwiseA & bitwiseB)); // AND
        System.out.println("bitwiseA | bitwiseB: " + (bitwiseA | bitwiseB)); // OR
        System.out.println("bitwiseA ^ bitwiseB: " + (bitwiseA ^ bitwiseB)); // XOR
        System.out.println("~bitwiseA: " + (~bitwiseA)); // NOT
        System.out.println("bitwiseA << 1: " + (bitwiseA << 1)); // Left Shift
        System.out.println("bitwiseA >> 1: " + (bitwiseA >> 1)); // Right Shift
        System.out.println("bitwiseA >>> 1: " + (bitwiseA >>> 1)); // Unsigned Right Shift

        // 7. Ternary Operator
        int age = 18;
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println("\nTernary Operator:");
        System.out.println("Is age >= 18? " + result);

        // 8. Instanceof Operator
        allOperators obj = new allOperators();
        System.out.println("\nInstanceof Operator:");
        System.out.println("obj instanceof allOperators: " + (obj instanceof allOperators));
    }
}
