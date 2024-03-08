import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class scannerIntro4 {
    public static void main(String[] args) {
        System.out.println("Please enter a random number: ");
        Scanner input = new Scanner(System.in);
        System.out.println("Your row number is: " + input.nextInt());
    }
}
