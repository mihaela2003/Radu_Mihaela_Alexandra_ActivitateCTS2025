package banca.strategy.main;

import banca.strategy.clase.Client;
import banca.strategy.clase.PersoanaFizica;
import banca.strategy.clase.PersoanaJuridica;
import banca.strategy.clase.TipClient;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("gigel", new PersoanaFizica());
        client.trimiteActeCatreVerificare();
        TipClient tipClient = new PersoanaJuridica();
        client.setTipClient(tipClient);
        client.trimiteActeCatreVerificare();
    }
}