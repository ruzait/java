package PackageB;

import PackageA.ClassA; // Import ClassA from PackageA

public class ClassC {
    public static void main(String[] args) {
        ClassA classA = new ClassA(); // Accessible because ClassA is public
        classA.displayMessage(); // Accessible because displayMessage is public
    }
}
