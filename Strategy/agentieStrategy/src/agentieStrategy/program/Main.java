package agentieStrategy.program;

import agentieStrategy.clase.Card;
import agentieStrategy.clase.Cash;
import agentieStrategy.clase.Client;

public class Main {
    public static void main(String[] args) {
        Client client =  new Client("Popescu");

        client.setModPlata(new Card());
        client.plateste(300);

        client.setModPlata(new Cash());
        client.plateste(100);
    }
}