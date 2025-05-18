package sportiv.composite.clase;

public class Subsectiune implements Structura{
    private String denumire;

    public Subsectiune(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void adaugaStructura(Structura structura) {
        System.out.println("nu a fost implementata");
    }

    @Override
    public void stergeStructura(Structura structura) {
        System.out.println("nu a fost implementata");
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Subsectiunea: " + this.denumire);
    }

    @Override
    public Structura getStructura(int cheie) {
        return null;
    }
}
