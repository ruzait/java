public class ClassB {
    public static void main(String[] args) {
        ClassA classA = new ClassA(); // Accessing within the same package
        classA.displayMessage();     // This is allowed due to default access
    }
}
