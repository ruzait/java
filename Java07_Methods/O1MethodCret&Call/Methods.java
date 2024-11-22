public class Methods {

    // Methods are used to perform certain actions, and they are also known as functions.
    public static void main(String[] args) {
        add();
        System.out.println("After Methoed Print statment");
    }

    // void means that this method does not have a return value.
    public static void add(){
        int a, b, z;

        a = 10;
        b = 50;
        z = a + b;
        System.out.println(z);
    }
}