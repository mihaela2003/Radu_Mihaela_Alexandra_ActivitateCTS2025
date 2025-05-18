package farmacie.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectie implements Structura{
    private String denumire;
    private List<Structura> lista;

    public Sectie(String denumire) {
        this.denumire = denumire;
        this.lista = new ArrayList<Structura>();
    }

    @Override
    public void adaugaStructura(Structura structura) {
        lista.add(structura);
    }

    @Override
    public void stergeStructura(Structura structura) {
        lista.remove(structura);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Sectia: " + this.denumire);
        for (Structura sectie: lista){
            sectie.afiseazaDescriere();
        }
    }

    @Override
    public Structura getStructura(int cheie) {
        return lista.get(cheie);
    }
}
