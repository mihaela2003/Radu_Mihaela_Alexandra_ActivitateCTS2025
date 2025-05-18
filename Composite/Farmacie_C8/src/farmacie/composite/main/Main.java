package farmacie.composite.main;

import farmacie.composite.clase.Sectie;
import farmacie.composite.clase.Structura;
import farmacie.composite.clase.Subsectie;

public class Main {
    public static void main(String[] args) {
        Structura general = new Sectie("general");
        Structura raceala = new Sectie("raceala");
        Structura durere = new Sectie("durere");
        Structura antibiotic = new Sectie("antibiotic");

        Structura adulti = new Subsectie("adulti");
        Structura copii = new Subsectie("copii");
        Structura med1 = new Subsectie("med1");

        raceala.adaugaStructura(adulti);
        durere.adaugaStructura(copii);
        antibiotic.adaugaStructura(med1);

        general.adaugaStructura(raceala);
        general.adaugaStructura(durere);
        general.adaugaStructura(antibiotic);

        general.afiseazaDescriere();
    }
}
