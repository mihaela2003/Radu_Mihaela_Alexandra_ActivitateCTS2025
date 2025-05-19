package agentie.facade.clase;

public class CompanieAeriana {
    private String numeCompanieAeriana;

    public CompanieAeriana(String numeCompanieAeriana) {
        this.numeCompanieAeriana = numeCompanieAeriana;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CompanieAeriana{");
        sb.append("numeCompanieAeriana='").append(numeCompanieAeriana).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Zbor rezervaBiletAvion(String plecare, String destinatie){
        Zbor zbor = new Zbor(this, plecare, destinatie);
        return zbor;
    }
}
