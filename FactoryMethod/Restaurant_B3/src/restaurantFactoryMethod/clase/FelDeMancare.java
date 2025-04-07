package restaurantFactoryMethod.clase;

public abstract class FelDeMancare {
    private float pret;
    private float calorii;
    private int cantitate;

    public FelDeMancare(float pret, float calorii, int cantitate) {
        this.pret = pret;
        this.calorii = calorii;
        this.cantitate = cantitate;
    }

    public abstract void descriere();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FelDeMancare{");
        sb.append("pret=").append(pret);
        sb.append(", calorii=").append(calorii);
        sb.append(", cantitate=").append(cantitate);
        sb.append('}');
        return sb.toString();
    }
}
