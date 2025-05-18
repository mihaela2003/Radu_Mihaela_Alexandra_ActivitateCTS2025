package banca.composite.clase;

public class Filiala implements Structura{
    private String denumire;

    public Filiala(String denumire) {
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
        System.out.println("Filiala: " + this.denumire);
    }

    @Override
    public Structura getStructura(int cheie) {
        return null;
    }
}
