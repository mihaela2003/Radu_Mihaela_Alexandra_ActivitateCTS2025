package restaurantSImpleFactory.clase;

public class SupaFactory {
    private float pret;
    private int calorii;

    public SupaFactory(float pret, int calorii) {
        this.pret = pret;
        this.calorii = calorii;
    }

    public Supa getSupa(TipSupa tipSupa, float cantitate){
        switch (tipSupa){
            case LEGUME -> {
                return new SupaLegume(pret, calorii, cantitate);
            }
            case CIUPERCI -> {
                return new SupaCiuperci(pret, calorii, cantitate);
            }
            case VITA -> {
                return new SupaVita(pret, calorii, cantitate);
            }
            default -> {
                return null;
            }
        }
    }
}
