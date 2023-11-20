package classstructuremethods;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();

        client.name = "Peter";
        client.year = 1986;
        client.address = "Ózd";

        client.migrate("Budapest");

        System.out.println(client.getName());
        System.out.println(client.getYear());
        System.out.println(client.getAddress());

        System.out.println(client.getAddress());


    }
}
