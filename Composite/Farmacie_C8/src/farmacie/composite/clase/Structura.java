package farmacie.composite.clase;

public interface Structura {
    void adaugaStructura(Structura structura);
    void stergeStructura(Structura structura);
    void afiseazaDescriere();
    Structura getStructura(int cheie);
}
