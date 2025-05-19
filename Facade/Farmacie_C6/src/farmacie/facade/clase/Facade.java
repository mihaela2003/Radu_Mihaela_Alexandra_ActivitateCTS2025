package farmacie.facade.clase;

import java.util.ArrayList;
import java.util.List;

public class Facade {
    public String verificareReteta(Client client){
        Medicament medicament = new Medicament(10f, 5, "paracetamol");
        Medicament medicament1 = new Medicament(15f, 8,"aspacardin");

        List<Medicament> listaMedicamente = new ArrayList<Medicament>();
        listaMedicamente.add(medicament);
        listaMedicamente.add(medicament1);

        Reteta reteta = new Reteta(true);

        if(reteta.isEsteInSistem()){
            int count = 0;
            for (Medicament med: listaMedicamente){
                if(med.verificareStocMedicament()){
                    count++;
                }
            }
            if(count == listaMedicamente.size()){
                if(client.isAreCardSanatate()){
                    return "o sa va dam imediat medicamentele";
                } else {
                    return "nu aveti card de sanatate";
                }
            } else {
                return "nu avem toate medicamentele in stoc";
            }
        } else {
            return "reteta nu este in sistem...nu va putem da medicamentele";
        }
    }
}
