class classObjectCreate {
    String name;
    int rollNum;

    public void display(){
        System.out.println(name);
        System.out.println(rollNum);
    }

    public static void main(String[] args) {
        classObjectCreate cClass = new classObjectCreate();
        cClass.name = "Java";
        cClass.rollNum = 21;

        cClass.display();
    }
}
