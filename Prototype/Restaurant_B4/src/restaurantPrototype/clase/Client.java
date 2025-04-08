package restaurantPrototype.clase;

public class Client extends ClientAbstract {
    private String nume;
    private String nrTelefon;

    public Client(String tipRezervare, int nrPersoane, String dataRezervare, int oraRezervare, String nume, String nrTelefon) {
        super(tipRezervare, nrPersoane, dataRezervare, oraRezervare);
        this.nume = nume;
        this.nrTelefon = nrTelefon;
    }

    public Client() {
        super();
    }

    @Override
    public ClientAbstract copiaza(String dataRezervare) {
        Client client = new Client();
        client.tipRezervare = this.tipRezervare;
        client.nrPersoane = this.nrPersoane;
        client.dataRezervare = this.dataRezervare;
        client.oraRezervare = this.oraRezervare;
        client.nume = this.nume;
        client.nrTelefon = this.nrTelefon;
        return client;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append(", tipRezervare='").append(tipRezervare).append('\'');
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", dataRezervare='").append(dataRezervare).append('\'');
        sb.append(", oraRezervare=").append(oraRezervare);
        sb.append('}');
        return sb.toString();
    }
}
