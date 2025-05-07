package spitalComposite.clase;

public class Sectie implements ISpital{
    private String denumire;

    public Sectie(String denumire) {
        this.denumire = denumire;
    }


    @Override
    public void adaugaDepartament(ISpital departament) {
        System.out.println("nu a fost implementata");
    }

    @Override
    public void stergeDepartament(ISpital departament) {
        System.out.println("nu a fost implementata");
    }

    @Override
    public ISpital getDepartament(int index) {
        return null;
    }

    @Override
    public void descriere() {
        System.out.println("Sectia: " + denumire);
    }
}
