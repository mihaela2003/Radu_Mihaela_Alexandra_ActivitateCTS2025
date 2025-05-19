package farmacie.facade.main;

import farmacie.facade.clase.Client;
import farmacie.facade.clase.Facade;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("gigel", true);
        Facade facade = new Facade();
        System.out.println(facade.verificareReteta(client));
    }
}