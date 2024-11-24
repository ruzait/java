package PackageA;

public class ClassB {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.publicMethod(); // Accessible within the same package
    }
}
