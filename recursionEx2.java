public class recursionEx2 {
    static int factorial(int n){
        int t;
        if (n == 0){
            return 1;
        }
        else{
            t = factorial(n - 1);
            return n * t;
        }
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
