package farmacie.composite.clase;

public class Subsectie implements Structura{
    private String denumire;

    public Subsectie(String denumire) {
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
        System.out.println("Subsectia: " + this.denumire);
    }

    @Override
    public Structura getStructura(int cheie) {
        return null;
    }
}
