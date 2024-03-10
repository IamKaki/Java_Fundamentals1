public class classConstructor3 {
    int modelYear;
    String modelname;

    public classConstructor3(int year, String name){
        modelYear = year;
        modelname = name;
    }

    public static void main(String[] args) {
        classConstructor3 myObj = new classConstructor3(2009, "Mustang");

        System.out.println("The vehicle is a " + myObj.modelYear + " " + myObj.modelname);
    }
}
