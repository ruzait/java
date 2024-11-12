public class dataType {

    public static void main(String[] args) {
        
        // Whole Number data types Ranges

        // byte = 8 bits

        /*
            byte    <1 byte>    =>  -128 to 127
            short   <2 bytes>   =>  -32768 to 32767
            int     <4 bytes>   =>  -2,147,483,648 to 2,147,483,647    2Billions
            long    <8 bytes>   =>  -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807     Quintillions
        */

        byte age = 21;
        System.out.println(age);

        short num = 31999;
        System.out.println(num);

        int cuntrys = 2000000000;
        System.out.println(cuntrys);

        long price = 200000000000000l;
        System.out.println(price);


        // Decimal Number data types Ranges

        /*
        float   <4 bytes>   => 6 to 7 decimal digits (Lastly add "f")
        double  <8 bytes>   => 15 to 16 decimal digits (Lastly can add "d")
        */

        float GPA = 3.7F;
        System.out.println(GPA);

        double vatPrice = 19.99;
        System.out.println(vatPrice);

        // boolean  <1 bit>  => true or false

        boolean isJavaFun = true;
        boolean isFishTasty = false;

        System.out.println(isJavaFun);     
        System.out.println(isFishTasty);
        
        // char     <2 bytes> => single character/letter or ASCII values

        char myGrade = 'Z';
        System.out.println(myGrade);

        char myVar1 = 65;
        char myVar2 = 66;
        char myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);

        // String   <n * 2 bytes> =>  sequence of characters (text)

        String greeting = "Hello World";
        System.out.println(greeting);
    }
}