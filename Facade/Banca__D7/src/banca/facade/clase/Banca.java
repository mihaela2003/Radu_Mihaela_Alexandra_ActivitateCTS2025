package banca.facade.clase;

public class Banca {
    private boolean areCreante;

    public Banca(boolean areCreante) {
        this.areCreante = areCreante;
    }

    public boolean isAreCreante() {
        return areCreante;
    }
}
