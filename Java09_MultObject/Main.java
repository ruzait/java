class multiObject {
    String name;
    int rollNum;

    public void display(){
        System.out.println(name);
        System.out.println(rollNum);
    }

    public void setVar(String uName, int UrollNum){
        name = uName;
        rollNum = UrollNum;
    }
}

public class Main {

    public static void main(String[] args) {

        multiObject cClass = new multiObject();
        cClass.name = "Java";
        cClass.rollNum = 21;
        cClass.display();

        multiObject secondObj = new multiObject();
        secondObj.name = "Python";
        secondObj.rollNum = 3;
        secondObj.display();

        // set variable in function
        multiObject useFun = new multiObject();
        useFun.setVar("Rusaid", 22);
        useFun.display();
    }
}
