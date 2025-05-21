package spital.observer.main;

import spital.observer.clase.Observer;
import spital.observer.clase.Pacient;
import spital.observer.clase.Spital;

public class Main {
    public static void main(String[] args) {
        Observer pacient1 = new Pacient("gigel");
        Observer pacient2 = new Pacient("costel");
        Observer pacient3 = new Pacient("maricica");

        Spital spital = new Spital();
        spital.adaugaObserver(pacient1);
        spital.adaugaObserver(pacient2);
        spital.adaugaObserver(pacient3);

        spital.notifica("a aparut un virus");
    }
}