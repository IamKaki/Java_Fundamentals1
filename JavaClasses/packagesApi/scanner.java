import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your surname please.");

        String surname = myObj.nextLine();
        System.out.println("My good name is " + surname);
    }
}
