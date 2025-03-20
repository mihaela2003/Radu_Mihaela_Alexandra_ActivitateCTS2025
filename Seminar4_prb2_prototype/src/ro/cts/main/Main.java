package ro.cts.main;

import ro.cts.clase.AbstractRezervare;
import ro.cts.clase.RezervareTerasa;

public class Main {
    public static void main(String[] args) {
        AbstractRezervare rezervareTerasa = new RezervareTerasa(12, 12, "Popica", 5, true);
        AbstractRezervare rezervareTerasa1 = rezervareTerasa.copiaza(12);
        AbstractRezervare rezervareTerasa2 = rezervareTerasa1.copiaza(30);

        System.out.println(rezervareTerasa.toString());
        System.out.println(rezervareTerasa1.toString());
        rezervareTerasa2.setZi(12);
        System.out.println(rezervareTerasa2.toString());
    }
}