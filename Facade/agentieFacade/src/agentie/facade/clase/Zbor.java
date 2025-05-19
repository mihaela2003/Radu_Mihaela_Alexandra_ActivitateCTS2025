package agentie.facade.clase;

public class Zbor {
    private CompanieAeriana companie;
    private String orasPlecare;
    private String destinatie;

    public Zbor(CompanieAeriana companie, String orasPlecare, String destinatie) {
        super();
        this.companie = companie;
        this.orasPlecare = orasPlecare;
        this.destinatie = destinatie;
    }

    public CompanieAeriana getCompanie() {
        return companie;
    }

    public void setCompanie(CompanieAeriana companie) {
        this.companie = companie;
    }

    public String getOrasPlecare() {
        return orasPlecare;
    }

    public void setOrasPlecare(String orasPlecare) {
        this.orasPlecare = orasPlecare;
    }

    public String getDestinatie() {
        return destinatie;
    }

    public void setDestinatie(String destinatie) {
        this.destinatie = destinatie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Zbor{");
        sb.append("companie=").append(companie);
        sb.append(", orasPlecare='").append(orasPlecare).append('\'');
        sb.append(", destinatie='").append(destinatie).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
