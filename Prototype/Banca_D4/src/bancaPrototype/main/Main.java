package bancaPrototype.main;

import bancaPrototype.clase.Client;
import bancaPrototype.clase.ContAbstract;

public class Main {
    public static void main(String[] args) {
        ContAbstract client = new Client("134567jhgfds", "6031104031567", 912, "Maricica", true);
        System.out.println(client);
        ContAbstract client2 = client.copiaza("Maricica");
        System.out.println(client2);
    }
}