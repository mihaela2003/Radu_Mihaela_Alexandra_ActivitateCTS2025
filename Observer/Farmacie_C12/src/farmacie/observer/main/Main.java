package farmacie.observer.main;

import farmacie.observer.clase.Client;
import farmacie.observer.clase.Farmacie;
import farmacie.observer.clase.Observer;

public class Main {
    public static void main(String[] args) {
        Observer client1 = new Client("gigel");
        Observer client2 = new Client("costel");
        Observer client3 = new Client("maricica");

        Farmacie farmacie = new Farmacie();

        farmacie.adaugaObserver(client1);
        farmacie.adaugaObserver(client2);
        farmacie.adaugaObserver(client3);

        farmacie.notifica("avem 30% reducere la produsele pentru skincare");
    }
}