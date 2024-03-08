import java.util.Scanner;

public class celcius_Fare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter degrees in C: ");
        
        float tempC = in.nextFloat();
        float tempF = (tempC * 9/5) + 32;

        System.out.println(tempF);
    }
}
