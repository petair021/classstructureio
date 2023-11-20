package training;

import java.util.Scanner;

public class HeyWorld {
    public static void main(String[] args) {
        System.out.println("Adj meg egy számot!");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();

        System.out.println("Adj meg még egy számot!");
        int number2 = scanner.nextInt();

        // Consume the newline character
       scanner.nextLine();

        System.out.println(number1 + number2);

        System.out.println("Adj meg felhasználónevét!");
        String userName = scanner.nextLine();

        System.out.println("Adj meg email címét!");
        String mailAddress = scanner.nextLine();

        System.out.println("Az ön felhasználóneve " + userName + " és email címe " + mailAddress);

        // Close the scanner to release resources
        scanner.close();
    }
}