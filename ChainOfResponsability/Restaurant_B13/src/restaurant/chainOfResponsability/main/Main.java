package restaurant.chainOfResponsability.main;

import restaurant.chainOfResponsability.clase.Libera;
import restaurant.chainOfResponsability.clase.Ocupata;
import restaurant.chainOfResponsability.clase.Rezervare;
import restaurant.chainOfResponsability.clase.Rezervata;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervata = new Rezervata();
        Rezervare ocupata = new Ocupata();
        Rezervare libera = new Libera();

        rezervata.setUrmRezervare(ocupata);
        ocupata.setUrmRezervare(libera);
        libera.setUrmRezervare(null);

        rezervata.stareMasa();
    }
}