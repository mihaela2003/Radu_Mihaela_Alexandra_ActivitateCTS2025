package restaurantPrototype.clase;

public abstract class ClientAbstract {
    protected String tipRezervare;
    protected int nrPersoane;
    protected String dataRezervare;
    protected int oraRezervare;

    public ClientAbstract(String tipRezervare, int nrPersoane, String dataRezervare, int oraRezervare) {
        if (tipRezervare.length() > 0) {
            this.tipRezervare = tipRezervare;
        } else {
            this.tipRezervare = "nu conteaza";
        }
        if (nrPersoane > 2) {
            this.nrPersoane = nrPersoane;
        } else {
            this.nrPersoane = 2;
        }
        if(dataRezervare.length() > 0) {
            this.dataRezervare = dataRezervare;
        } else {
            this.dataRezervare = "25 ianuarie 2024";
        }
        if(oraRezervare >= 10 && oraRezervare <= 22) {
            this.oraRezervare = oraRezervare;
        } else {
            this.oraRezervare = 10;
        }
    }

    public ClientAbstract() {
        this.tipRezervare = "nu conteaza";
        this.nrPersoane = 2;
        this.dataRezervare = "25 ianuarie 2024";
        this.oraRezervare = 10;
    }

    public abstract ClientAbstract copiaza(String dataRezervare);

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ClientPrototype{");
        sb.append("tipRezervare='").append(tipRezervare).append('\'');
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", dataRezervare='").append(dataRezervare).append('\'');
        sb.append(", oraRezervare=").append(oraRezervare);
        sb.append('}');
        return sb.toString();
    }
}
