public class methodCreation{
    int x = 10, y = 22;

    public static void main(String[] args){
        methodCreation myMethod1 = new methodCreation();
        methodCreation myMethod2 = new methodCreation();

        System.out.println(myMethod1.x);
        System.out.println(myMethod2.y);
    }
}