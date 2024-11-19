public class A01_Diclaration {

    public static void main(String[] args) {

        /*
         * Arrays are fundamental structures in Java that allow us to store multiple
         * values of the same data type in a single variable.
         */

    // Array Diclaration

    int[] roalNum = new int[10];
    roalNum[0] = 1;

    System.out.println(roalNum);

    for (int i=0; i<10; i++){
        System.out.println(roalNum[i]);
    }

    }
}