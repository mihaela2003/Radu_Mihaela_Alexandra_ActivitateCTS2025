package banca.flywieght.clase;

import java.util.HashMap;

public class FabricaConturi {
    private HashMap<String, IDetinator> colectieConturi;

    public FabricaConturi() {
        colectieConturi = new HashMap<String, IDetinator>();
    }

    public IDetinator getInformatii(String numarTelefon) throws Exception {
        IDetinator detinator = colectieConturi.get(numarTelefon);
        if(detinator == null){
            throw new Exception("nu a fost gasit");
        }
        else {
            return detinator;
        }
    }

    public IDetinator getInformatii(String numarTelefon, String nume, String adresa, String email){
        IDetinator detinator = colectieConturi.get(numarTelefon);
        if(detinator == null){
            detinator = new Detinator(nume, adresa, numarTelefon, email);
            colectieConturi.put(numarTelefon, detinator);
        }
        return detinator;
    }
}
