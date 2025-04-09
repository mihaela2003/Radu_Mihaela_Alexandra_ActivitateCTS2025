package serviceAuto.prototype;

public abstract class AbstractSticker {
    protected String culoare;
    protected IMasina masina;

    public AbstractSticker(String culoare, IMasina masina) {
        this.culoare = culoare;
        this.masina = masina;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AbstractSticker{");
        sb.append("culoare='").append(culoare).append('\'');
        sb.append(", masina=").append(masina);
        sb.append('}');
        return sb.toString();
    }

    public abstract AbstractSticker copiaza(IMasina masina);
}
