package sportiv.flywieght.clase;

import java.util.HashMap;

public class FabricaPersoane {
    private HashMap<Integer, IPersoana> colectiePersoane;

    public FabricaPersoane() {
        colectiePersoane = new HashMap<Integer, IPersoana>();
    }

    public IPersoana getPersoana(int cod) throws Exception {
        IPersoana persoana = colectiePersoane.get(cod);
        if(colectiePersoane == null){
            throw new Exception("nu a fost gasita persoana");
        }
        else {
            return persoana;
        }
    }

    public IPersoana getPersoana(int cod, float inaltime, float latime){
        IPersoana persoana = colectiePersoane.get(cod);
        if(persoana == null){
            persoana = new Persoana(cod, inaltime, latime);
            colectiePersoane.put(cod, persoana);
        }
        return persoana;
    }
}
