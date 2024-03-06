public class methodsParameter9 {
    static void myMethod(int Age){
        if (Age < 18){
            System.out.println("Access denied, too young!");
        }
        else{
            System.out.println("Access granted, enjoy yourself.");
        }
    }
    public static void main(String[] args){
        myMethod(16);
    }
}
