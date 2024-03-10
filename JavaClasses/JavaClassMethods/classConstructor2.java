public class classConstructor2 {
    int x;
    public classConstructor2(int y){
        x = y;
    }

    public static void main(String[] args){
        classConstructor2 myObject = new classConstructor2(5);

        System.out.println(myObject.x);
    }
}
