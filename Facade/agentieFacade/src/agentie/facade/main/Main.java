package agentie.facade.main;

import agentie.facade.clase.Facade;

public class Main {
    public static void main(String[] args) {
        Facade rezervareSejur = new Facade();
        rezervareSejur.rezervaPachetCazareTransport("Bucuresti", "Moeciu de Sus");
    }
}