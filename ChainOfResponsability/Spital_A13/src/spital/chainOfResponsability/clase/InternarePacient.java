package spital.chainOfResponsability.clase;

public abstract class InternarePacient {
    private InternarePacient internarePacient;

    public InternarePacient() {
        this.internarePacient = null;
    }

    public InternarePacient getUrmInternarePacient() {
        return internarePacient;
    }

    public void setUrmInternarePacient(InternarePacient internarePacient) {
        this.internarePacient = internarePacient;
    }

    public abstract void gestiunePacient(int stare);
}
