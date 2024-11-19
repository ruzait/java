public class A02_2Darray {
    public static void main(String[] args) {
        // Declare and initialize a 2D array with 5 rows and 2 columns
        int[][] array = new int[5][2];
        
        // Example: Assigning values to the array
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                array[i][j] = i * j; // Just an example assignment
            }
        }

        // Print the 2D array
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
