package agentie.decorator.main;

import agentie.decorator.clase.OfertaPachetCazare;
import agentie.decorator.clase.PachetCazare;
import agentie.decorator.clase.PachetTuristic;

public class Main {
    public static void main(String[] args) {
        PachetTuristic pachetTuristic = new PachetCazare();
        pachetTuristic.descriere();
        System.out.println("acest pachet nu poate fi anulat");
        System.out.println();

        OfertaPachetCazare pachetTuristicOferta = new OfertaPachetCazare(pachetTuristic);
        pachetTuristicOferta.descriere();
        System.out.println("acest pachet poate fi anulat");
        pachetTuristicOferta.anulareRezervare();
    }
}