package restaurantComposite.clase;

public class Item implements Meniu{
    private String nume;

    public Item(String nume) {
        this.nume = nume;
    }

    @Override
    public void adaugaSectiune(Meniu sectiune) {
        System.out.println("nu a fost implementata");
    }

    @Override
    public void stergeSectiune(Meniu sectiune) {
        System.out.println("nu a fost implementata");
    }

    @Override
    public Meniu getSectiune(int index) {
        return null;
    }

    @Override
    public void descriere() {
        System.out.println("Item: " + nume);
    }
}
