package banca.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Agentie implements Structura{
    private String denumire;
    private List<Structura> lista;

    public Agentie(String denumire) {
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
        System.out.println("Agentia: " + this.denumire);
        for(Structura agentie: lista){
            agentie.afiseazaDescriere();
        }
    }

    @Override
    public Structura getStructura(int cheie) {
        return lista.get(cheie);
    }
}
