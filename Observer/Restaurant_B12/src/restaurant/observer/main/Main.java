package restaurant.observer.main;

import restaurant.observer.clase.Client;
import restaurant.observer.clase.Observer;
import restaurant.observer.clase.Restaurant;

public class Main {
    public static void main(String[] args) {
        Observer client1 = new Client("gigel");
        Observer client2 = new Client("costel");
        Observer client3 = new Client("maricica");

        Restaurant restaurant = new Restaurant();
        restaurant.adaugaObserver(client1);
        restaurant.adaugaObserver(client2);
        restaurant.adaugaObserver(client3);

        restaurant.notifica("am adaugat un nou produs in meniu");
        restaurant.notifica("anumite produse din meniu sunt la oferta");
    }
}