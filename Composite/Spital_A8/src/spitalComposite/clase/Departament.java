package spitalComposite.clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements ISpital{
    private List<ISpital> lista;
    private String denumire;

    public Departament(String denumire) {
        this.denumire = denumire;
        lista = new ArrayList<ISpital>();
    }

    @Override
    public void adaugaDepartament(ISpital departament) {
        lista.add(departament);
    }

    @Override
    public void stergeDepartament(ISpital departament) {
        lista.remove(departament);
    }

    @Override
    public ISpital getDepartament(int index) {
        return lista.get(index);
    }

    @Override
    public void descriere() {
        System.out.println("Departamentul: " + denumire);
        for(ISpital departament: lista){
            departament.descriere();
        }
    }
}
