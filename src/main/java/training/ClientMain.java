package training;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg a nevet:");
        client.name = scanner.nextLine();

        System.out.println("Adja meg a születési évet:");
        client.year = scanner.nextInt();

        // Consume the newline character
        scanner.nextLine();

        System.out.println("Adja meg a címet:");
        client.address = scanner.nextLine();

        System.out.println("Név: " + client.name + " Születési év: " + client.year + " Cím: "+ client.address);




    }
}
