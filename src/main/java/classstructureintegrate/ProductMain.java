package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        System.out.println("Give name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Give price: ");
        int price = scanner.nextInt();

        Product product = new Product(name, price);
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(product.increasePrice(price));
        System.out.println(product.decreasePrice(price));
    }
}
