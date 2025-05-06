package restaurantComposite.clase;

public interface Meniu {
    void adaugaSectiune(Meniu sectiune);
    void stergeSectiune(Meniu sectiune);
    Meniu getSectiune(int index);
    void descriere();
}
