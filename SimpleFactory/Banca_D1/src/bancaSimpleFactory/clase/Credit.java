package bancaSimpleFactory.clase;

public abstract class Credit {
    private String detinator;
    private float suma;

    public Credit(String detinator, float suma) {
        this.detinator = detinator;
        this.suma = suma;
    }

    public abstract void descriere();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Credit{");
        sb.append("detinator='").append(detinator).append('\'');
        sb.append(", suma=").append(suma);
        sb.append('}');
        return sb.toString();
    }
}
