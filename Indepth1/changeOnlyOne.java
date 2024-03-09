public class changeOnlyOne {
    int x = 30;

    public static void main(String[] args) {
        changeOnlyOne myObject1 = new changeOnlyOne();
        changeOnlyOne myObject2 = new changeOnlyOne();
        changeOnlyOne myObject3 = new changeOnlyOne();

        myObject2.x = 33;

        System.out.println(myObject1.x);
        System.out.println(myObject2.x);
        System.out.println(myObject3.x);
    }
}
