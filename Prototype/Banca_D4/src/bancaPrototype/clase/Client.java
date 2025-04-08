package bancaPrototype.clase;

public class Client extends ContAbstract{
    private String nume;
    private boolean aMaiFacutCont;

    public Client() {
        super();
    }

    public Client(String IBAN, String cnp, int cvv, String nume, boolean aMaiFacutCont) {
        super(IBAN, cnp, cvv);
        this.nume = nume;
        this.aMaiFacutCont = aMaiFacutCont;
    }

    @Override
    public ContAbstract copiaza(String nume) {
        Client client = new Client();
        client.IBAN = this.IBAN;
        client.cnp = this.cnp;
        client.cvv = this.cvv;
        client.nume = this.nume;
        client.aMaiFacutCont = this.aMaiFacutCont;
        return client;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", aMaiFacutCont=").append(aMaiFacutCont);
        sb.append(", IBAN='").append(IBAN).append('\'');
        sb.append(", cnp='").append(cnp).append('\'');
        sb.append(", cvv=").append(cvv);
        sb.append('}');
        return sb.toString();
    }
}
