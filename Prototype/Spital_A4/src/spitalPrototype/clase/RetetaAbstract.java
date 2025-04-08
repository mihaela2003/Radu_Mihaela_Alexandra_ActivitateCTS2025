package spitalPrototype.clase;

public abstract class RetetaAbstract {
    protected String numeChimist;
    protected String codReteta;

    public RetetaAbstract(String numeChimist, String codReteta) {
        if (numeChimist.length() > 0) {
            this.numeChimist = numeChimist;
        } else {
            this.numeChimist = "Anonim";
        }
        if (codReteta.length() >= 6) {
            this.codReteta = codReteta;
        } else {
            this.codReteta = "X1X2X3";
        }
    }

    public RetetaAbstract() {
        this.numeChimist = "Anonim";
        this.codReteta = "X1X2X3";
    }

    public abstract RetetaAbstract copiaza(String denumireMedicament);

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RetetaPrototype{");
        sb.append("numeChimist='").append(numeChimist).append('\'');
        sb.append(", codReteta='").append(codReteta).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
