package spitalPrototype.clase;

public abstract class RetetaPrototype {
    protected String numeChimist;
    protected String codReteta;

    public RetetaPrototype(String numeChimist, String codReteta) {
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

    public RetetaPrototype() {
        this.numeChimist = "Anonim";
        this.codReteta = "X1X2X3";
    }

    public abstract RetetaPrototype copiaza(String denumireMedicament);

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RetetaPrototype{");
        sb.append("numeChimist='").append(numeChimist).append('\'');
        sb.append(", codReteta='").append(codReteta).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
