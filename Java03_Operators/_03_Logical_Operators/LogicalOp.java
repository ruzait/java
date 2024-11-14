public class LogicalOp {
    public static void main(String[] args) {
        
        int x = 5;

        // Logig Gates

        /*  
                            Logical and ( && )
            Returns true if both statements are true    
        */

        System.out.println(x < 5 &&  x < 10);


        /*  
                            Logical or ( || )
            Returns true if one of the statements is true    
        */

        System.out.println(x < 5 || x < 4);

        /*  
                            Logical not ( ! )
            Reverse the result, returns false if the result is true    
        */

        System.out.println(!(x < 5 && x < 10));
    }
}