package PackageB;

import PackageA.ClassA; // Import ClassA from PackageA

public class ClassC {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.publicMethod(); // Accessible from a different package
    }
}
