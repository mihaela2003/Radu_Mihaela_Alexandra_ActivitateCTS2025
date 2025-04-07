package sportivSimpleFactory.clase;

public abstract class Jucator {
    private String nume;
    private int salariu;

    public Jucator(String nume, int salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    public abstract void descriere();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Jucator{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", salariu=").append(salariu);
        sb.append('}');
        return sb.toString();
    }
}
