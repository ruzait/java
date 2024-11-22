public class recurtion {

    // Recursion is the technique of making a function call itself.
    public static void main(String[] args) {
        //natPrint(10);
        System.out.println(factorial(5));
    }

    public static void natPrint(int n){
        if (n == 1){
            System.out.println(n);
        }
        else{
            System.out.println(n);
            natPrint(n-1);
        }
    }

    public static long factorial(int n){

        if (n == 1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
}