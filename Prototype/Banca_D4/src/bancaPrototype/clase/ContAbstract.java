package bancaPrototype.clase;

public abstract class ContAbstract {
    protected String IBAN;
    protected String cnp;
    protected int cvv;

    public ContAbstract(String IBAN, String cnp, int cvv) {
        if (IBAN.length() > 0) {
            this.IBAN = IBAN;
        } else {
            this.IBAN = "necorespunzator";
        }
        if (cnp.length() == 13) {
            this.cnp = cnp;
        } else {
            this.cnp = "necorespunzator";
        }
        if (cvv >= 100 && cvv <= 999) {
            this.cvv = cvv;
        } else {
            this.cvv = 100;
        }
    }

    public ContAbstract() {
        this.IBAN = "necorespunzator";
        this.cnp = "necorespunzator";
        this.cvv = 100;
    }

    public abstract ContAbstract copiaza(String nume);

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContAbstract{");
        sb.append("IBAN='").append(IBAN).append('\'');
        sb.append(", cnp='").append(cnp).append('\'');
        sb.append(", cvv=").append(cvv);
        sb.append('}');
        return sb.toString();
    }
}
