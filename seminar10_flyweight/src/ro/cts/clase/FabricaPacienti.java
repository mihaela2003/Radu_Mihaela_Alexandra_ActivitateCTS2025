package ro.cts.clase;

import java.util.HashMap;

public class FabricaPacienti {
    private HashMap<String, PacientAbstract> colectiePacienti;

    public FabricaPacienti() {
        colectiePacienti = new HashMap<String, PacientAbstract>();
    }

    public PacientAbstract getPacient(String telefon) throws Exception {
        PacientAbstract pacient = colectiePacienti.get(telefon);
        if(pacient==null){
            throw new Exception("Pacientul nu exista!");
        }
        else {
            return pacient;
        }
    }

    public PacientAbstract getPacient(String nume, String numarTelefon, String adresa){
        PacientAbstract pacient = colectiePacienti.get(numarTelefon);
        if(pacient==null){
            pacient = new Pacient(nume, numarTelefon,adresa);
            colectiePacienti.put(numarTelefon, pacient);
        }
        return pacient;
    }
}
