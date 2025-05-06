package restaurantComposite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements Meniu{
    private String nume;
    private List<Meniu> lista;

    public Sectiune(String nume) {
        this.nume = nume;
        lista = new ArrayList<Meniu>();
    }

    @Override
    public void adaugaSectiune(Meniu sectiune) {
        lista.add(sectiune);
    }

    @Override
    public void stergeSectiune(Meniu sectiune) {
        lista.remove(sectiune);
    }

    @Override
    public Meniu getSectiune(int index) {
        return lista.get(index);
    }

    @Override
    public void descriere() {
        System.out.println("Sectiunea " + nume);
        for (Meniu sectiune:lista){
            sectiune.descriere();
        }
    }
}
