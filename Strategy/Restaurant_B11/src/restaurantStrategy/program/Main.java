package restaurantStrategy.program;

import restaurantStrategy.clase.Card;
import restaurantStrategy.clase.Cash;
import restaurantStrategy.clase.Client;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Costica", new Card());
        client.plateste(200);
        client.setModPlata(new Cash());
        client.plateste(345);
    }
}