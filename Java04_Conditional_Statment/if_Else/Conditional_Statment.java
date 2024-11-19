public class Conditional_Statment {

    public static void main(String[] args) {
        int marks = 30;

        if (75 <= marks && marks <= 100){
            System.out.println("Distinction pass");
        } 
        else if (65 <= marks && marks < 75){
            System.out.println("Very Good pass");
        }
        else if (55 <= marks && marks < 65){
            System.out.println("Credit pass");
        }
        else if (35 <= marks && marks < 55){
            System.out.println("Ordinary Pass");
        }
        else {
            System.out.println("Better Luck! Next Time");
        }



        String result = (marks == 100) ? "Your are Genus." : "Go! and sleep..";
        System.out.println(result);

    }

}