package Java10_AccessModifiers.O1_DefaultMod.cant.PackageB;

import PackageA.ClassA;

public class ClassC {
    public static void main(String[] args) {
        ClassA classA = new ClassA(); // Error
        classA.displayMessage();     // Error
    }
}
