package Laboratory_Activity1_02_08_2024;

import java.util.Scanner;

public class GettingGreater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Getting the Greater Value");
        System.out.print("Enter first Character: ");
        char fCharacter = input.next().charAt(0);
        System.out.print("Enter Second Character: ");
        char sCharacter = input.next().charAt(0);

        char greaterCharacter = (char) Math.max(fCharacter, sCharacter);

        System.out.println("----------------------------------------");
        System.out.println("The Character with the Greater Value is: " + greaterCharacter);
        System.out.println("----------------------------------------");
        System.out.println("Showing the ASCII Codes");
        System.out.println(fCharacter + ": " + (int) fCharacter);
        System.out.println(sCharacter + ": " + (int) sCharacter);

        input.close();
    }
}
