public class Main1 {
    static void myMethod(){
        System.out.println("You are doing great Kakiman.");
    }
    public void myMethod1(){
        System.out.println("You are killing it man.");
    }
    public static void main(String[] args) {
        myMethod();
        
        Main1 myObject1 = new Main1();
        myObject1.myMethod1();
    }
}
