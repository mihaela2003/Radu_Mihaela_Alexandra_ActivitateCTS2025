package restaurantSImpleFactory.clase;

public abstract class Supa {
    private float pret;
    private int calorii;
    private float cantitate;

    public Supa(float pret, int calorii, float cantitate) {
        this.pret = pret;
        this.calorii = calorii;
        this.cantitate = cantitate;
    }

    public float getPret() {
        return pret;
    }

    public int getCalorii() {
        return calorii;
    }

    public float getCantitate() {
        return cantitate;
    }

    public abstract void descriere();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Supa{");
        sb.append("pret=").append(pret);
        sb.append(", calorii=").append(calorii);
        sb.append(", cantitate=").append(cantitate);
        sb.append('}');
        return sb.toString();
    }
}
