public class multipleAtri {
    String fname = "John ";
    String lname = "Kaki ";
    String sname = "Gicovi.";
    int age = 33;

    public static void main(String[] args) {
        multipleAtri myObj1 = new multipleAtri();
        multipleAtri myObj2 = new multipleAtri();
        multipleAtri myObj3 = new multipleAtri();
        multipleAtri myObj4 = new multipleAtri();

        System.out.println("My names are: " + myObj1.fname + myObj2.lname + myObj3.sname);
        System.out.println("I am " + myObj4.age + " of age.");
    }
}
