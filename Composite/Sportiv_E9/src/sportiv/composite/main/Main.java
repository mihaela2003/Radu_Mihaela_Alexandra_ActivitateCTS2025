package sportiv.composite.main;

import sportiv.composite.clase.Sectiune;
import sportiv.composite.clase.Structura;
import sportiv.composite.clase.Subsectiune;

public class Main {
    public static void main(String[] args) {
        Structura general = new Sectiune("general");
        Structura tribuna = new Sectiune("tribuna");
        Structura peluza = new Sectiune("peluza");

        Structura tribunaNord = new Subsectiune("tribuna nord");
        Structura tribunaSud = new Subsectiune("tribuna sud");
        Structura tribunaCopii = new Subsectiune("tribuna copii");
        Structura vip = new Subsectiune("vip");

        general.adaugaStructura(tribuna);
        general.adaugaStructura(peluza);

        tribuna.adaugaStructura(tribunaNord);
        tribuna.adaugaStructura(tribunaCopii);
        peluza.adaugaStructura(tribunaSud);
        peluza.adaugaStructura(vip);

        general.afiseazaDescriere();
    }
}