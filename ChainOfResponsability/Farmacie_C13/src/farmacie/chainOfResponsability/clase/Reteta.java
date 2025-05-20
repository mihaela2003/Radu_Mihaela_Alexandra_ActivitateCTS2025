package farmacie.chainOfResponsability.clase;

public abstract class Reteta {
    private Reteta reteta;

    public Reteta() {
        this.reteta = null;
    }

    public Reteta getUrmReteta() {
        return reteta;
    }

    public void setUrmReteta(Reteta reteta) {
        this.reteta = reteta;
    }

    public abstract void stareReteta();
}
