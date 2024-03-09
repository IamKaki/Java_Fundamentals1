public class overidingValues {
    int x = 30;

    public static void main(String[] args) {
        overidingValues myObj = new overidingValues();
        myObj.x = 33;

        System.out.println(myObj.x);
    }
}
