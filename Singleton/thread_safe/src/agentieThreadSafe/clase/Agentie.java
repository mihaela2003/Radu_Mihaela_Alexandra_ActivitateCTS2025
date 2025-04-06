package agentieThreadSafe.clase;

public class Agentie {
    private String numeAgentie;
    private float capital;
    private int numarAngajati;
    private static Agentie instance = null;

    public Agentie(String numeAgentie, float capital, int numarAngajati) {
        this.numeAgentie = numeAgentie;
        this.capital = capital;
        this.numarAngajati = numarAngajati;
    }

    public void setNumeAgentie(String numeAgentie) {
        this.numeAgentie = numeAgentie;
    }

    public void setCapital(float capital) {
        this.capital = capital;
    }

    public void setNumarAngajati(int numarAngajati) {
        this.numarAngajati = numarAngajati;
    }

    public static synchronized Agentie getInstance(String numeAgentie, float capital, int numarAngajati){
        if (instance == null){
            instance = new Agentie(numeAgentie, capital, numarAngajati);
        }
        return instance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Agentie{");
        sb.append("numeAgentie='").append(numeAgentie).append('\'');
        sb.append(", capital=").append(capital);
        sb.append(", numarAngajati=").append(numarAngajati);
        sb.append('}');
        return sb.toString();
    }
}
