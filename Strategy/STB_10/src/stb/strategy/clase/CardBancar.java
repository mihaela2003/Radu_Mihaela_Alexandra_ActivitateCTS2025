package stb.strategy.clase;

public class CardBancar implements ModPlata{
    private float sold;

    public CardBancar(float sold) {
        this.sold = sold;
    }

    @Override
    public void plateste(int sumaDePlata) {
        if (this.sold >= sumaDePlata){
            System.out.println("ati platit cu cardul");
            this.sold -= sumaDePlata;
        } else {
            System.out.println("nu aveti sold suficient");
        }
    }
}
