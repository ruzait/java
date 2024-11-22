public class MethReturn {

    public static void main(String[] args){

        System.out.println(add(10, 100));
    }

    // you can run without 'public'
    public static int add(int a, int b){
    
        int z = a + b;
        return z;
    }
}