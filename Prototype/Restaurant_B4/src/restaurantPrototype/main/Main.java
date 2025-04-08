package restaurantPrototype.main;

import restaurantPrototype.clase.Client;
import restaurantPrototype.clase.ClientPrototype;

public class Main {
    public static void main(String[] args) {
        ClientPrototype client = new Client("vip", 4, "10 aprilie 2025", 15, "Gigel", "0734354656");
        System.out.println(client);
        ClientPrototype client2 = client.copiaza("10 aprilie 2025");
        System.out.println(client2);
    }
}