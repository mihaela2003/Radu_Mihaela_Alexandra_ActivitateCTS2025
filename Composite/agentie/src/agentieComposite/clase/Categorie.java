package agentieComposite.clase;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements Optiune{

    private List<Optiune> lista;
    private String nume;

    public Categorie(String nume) {
        lista = new ArrayList<Optiune>();
        this.nume = nume;
    }

    @Override
    public void stergeNod(Optiune optiune) throws Exception {
        lista.remove(optiune);
    }

    @Override
    public void adaugaNod(Optiune optiune) throws Exception {
        lista.add(optiune);
    }

    @Override
    public Optiune getNod(int index) throws Exception {
        return lista.get(index);
    }

    @Override
    public void descriere() {
        System.out.println("Categoria " + nume);
        for(Optiune optiune:lista){
            optiune.descriere();
        }
    }
}
