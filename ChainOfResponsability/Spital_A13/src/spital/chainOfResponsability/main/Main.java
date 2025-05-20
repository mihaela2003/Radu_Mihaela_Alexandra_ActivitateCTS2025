package spital.chainOfResponsability.main;

import spital.chainOfResponsability.clase.Externat;
import spital.chainOfResponsability.clase.InternarePacient;
import spital.chainOfResponsability.clase.Internat;
import spital.chainOfResponsability.clase.SubObservatie;

public class Main {
    public static void main(String[] args) {
        InternarePacient internat = new Internat();
        InternarePacient subObservatie = new SubObservatie();
        InternarePacient externat = new Externat();

        internat.setUrmInternarePacient(subObservatie);
        subObservatie.setUrmInternarePacient(externat);
        externat.setUrmInternarePacient(null);

        internat.gestiunePacient(5);
        internat.gestiunePacient(2);

    }
}