package PackageB;

import PackageA.ClassA;

public class ClassC {

    public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.protectedMethod(); // ERROR: protectedMethod is not accessible here
    }
}
