package ro.cts.clase;

public class CardBancar implements IMetodaPlata{
    private float sold;

    public CardBancar(float sold) {
        this.sold = sold;
    }

    @Override
    public void realizeazaPlata(float pretBilet) {
        if(this.sold >= pretBilet) {
            System.out.println("Am platit cu cardul bancar.");
            this.sold -= pretBilet;
        } else {
            System.out.println("Nu aveti bani suficienti sa platiti cu cardul.");
        }
    }
}
