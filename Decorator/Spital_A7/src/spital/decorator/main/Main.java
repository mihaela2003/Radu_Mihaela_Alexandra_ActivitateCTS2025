package spital.decorator.main;

import spital.decorator.clase.Decorator;
import spital.decorator.clase.RezultateOnline;
import spital.decorator.clase.RezultatePrintate;

public class Main {
    public static void main(String[] args) {
        RezultatePrintate rezultatePrintate = new RezultatePrintate("pacient1");

        rezultatePrintate.descriere();

        Decorator rezultateDecorate = new RezultateOnline(rezultatePrintate);
        rezultateDecorate.descriere();
    }
}