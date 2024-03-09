import java.util.Scanner;

public class celcius2fare {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Please enter your temperature in C: ");

        float tempC = user.nextFloat();
        float tempF = (tempC * 9/5) + 32;

        System.out.println(tempF);
    }
}
