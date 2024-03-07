public class methodOverload {
    static int summethod(int x, int y){
        return x + y;
    }
    static double summethod(double x, double y){
        return x + y;
    }
    public static void main(String[] args){
        System.out.println("int: " + summethod(10, 25));
        System.out.println("double: " + summethod(2.56, 3.98));
    }
}
