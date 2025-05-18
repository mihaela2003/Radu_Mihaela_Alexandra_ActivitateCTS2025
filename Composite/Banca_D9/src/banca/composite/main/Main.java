package banca.composite.main;

import banca.composite.clase.Agentie;
import banca.composite.clase.Filiala;
import banca.composite.clase.Structura;

public class Main {
    public static void main(String[] args) {
        Structura agentieMama = new Agentie("agentia mama");
        Structura agentie1 = new Agentie("agentie1");
        Structura agentie2 = new Agentie("agentie2");

        Structura filiala1 = new Filiala("filiala1");
        Structura filiala2 = new Filiala("filiala2");

        agentie1.adaugaStructura(filiala1);
        agentie2.adaugaStructura(filiala2);

        agentieMama.adaugaStructura(agentie1);
        agentieMama.adaugaStructura(agentie2);

        agentieMama.afiseazaDescriere();
    }
}