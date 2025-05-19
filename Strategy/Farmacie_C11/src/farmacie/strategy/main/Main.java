package farmacie.strategy.main;

import farmacie.strategy.clase.Card;
import farmacie.strategy.clase.Cash;
import farmacie.strategy.clase.Client;
import farmacie.strategy.clase.ModPlata;

public class Main {
    public static void main(String[] args) {
        ModPlata modPlata = new Cash();
        Client client = new Client("gigel", modPlata);
        client.platesteReteta(130f);
        client.setModPlata(new Card());
        client.platesteReteta(55.f);
        client.setModPlata(modPlata);
        client.platesteReteta(52.6f);
    }
}