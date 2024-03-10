public class classConstructor {
    int x;
    public classConstructor(){
        x = 10;
    }
    public static void main(String[] args) {
        classConstructor mymethod = new classConstructor();
        System.out.println(mymethod.x);
    }
}
