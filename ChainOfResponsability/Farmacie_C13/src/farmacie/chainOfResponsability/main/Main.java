package farmacie.chainOfResponsability.main;

import farmacie.chainOfResponsability.clase.Achizitionata;
import farmacie.chainOfResponsability.clase.Emisa;
import farmacie.chainOfResponsability.clase.Reteta;
import farmacie.chainOfResponsability.clase.Solicitata;

public class Main {
    public static void main(String[] args) {
        Reteta emisa = new Emisa();
        Reteta solicitata = new Solicitata();
        Reteta achizitionata =  new Achizitionata();

        emisa.setUrmReteta(solicitata);
        solicitata.setUrmReteta(achizitionata);
        achizitionata.setUrmReteta(null);

        emisa.stareReteta();
    }
}