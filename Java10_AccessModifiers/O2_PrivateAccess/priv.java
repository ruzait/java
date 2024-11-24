class a{
    private void dis1(){
        System.out.println("This is privat");
    }

    public void dis2(){
        System.out.println("This is public");
    }
}

public class priv {
    public static void main(String[] args) {
        a obj = new a();
        obj.dis2();

        // obj.disq1()
    }
}
