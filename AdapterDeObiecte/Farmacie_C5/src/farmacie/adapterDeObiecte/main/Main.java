package farmacie.adapterDeObiecte.main;

import farmacie.adapterDeObiecte.clase.AdapterAplicatie;
import farmacie.adapterDeObiecte.clase.AplicatieStocuri;
import farmacie.adapterDeObiecte.clase.AplicatieVanzare;

public class Main {

    public static void verificareAplicatie(AplicatieStocuri aplicatieStocuri){
        aplicatieStocuri.verificaStocPentruMedicament(2,3);
    }

    public static void main(String[] args) {
        AplicatieVanzare aplicatieVanzare = new AplicatieVanzare(1,"paracetamol", 7,12f);
        AdapterAplicatie adapterAplicatie = new AdapterAplicatie(aplicatieVanzare);
        verificareAplicatie(adapterAplicatie);

        AplicatieStocuri aplicatieStocuri = new AplicatieStocuri(2, "paracetamol", 2);
        verificareAplicatie(aplicatieStocuri);
    }
}