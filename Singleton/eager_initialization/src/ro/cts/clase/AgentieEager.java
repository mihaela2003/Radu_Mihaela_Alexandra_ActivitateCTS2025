package ro.cts.clase;

public class AgentieEager {
    private String numeAgentie;
    private float capital;
    private int numarAngajati;

    private static AgentieEager instance = new AgentieEager("AgeTur", 1000, 5);

    public AgentieEager(String numeAgentie, float capital, int numarAngajati) {
        this.numeAgentie = numeAgentie;
        this.capital = capital;
        this.numarAngajati = numarAngajati;
    }

    public String getNumeAgentie() {
        return numeAgentie;
    }

    public void setNumeAgentie(String numeAgentie) {
        this.numeAgentie = numeAgentie;
    }

    public float getCapital() {
        return capital;
    }

    public void setCapital(float capital) {
        this.capital = capital;
    }

    public int getNumarAngajati() {
        return numarAngajati;
    }

    public void setNumarAngajati(int numarAngajati) {
        this.numarAngajati = numarAngajati;
    }

    public static AgentieEager getInstance(){
        return instance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AgentieEager{");
        sb.append("numeAgentie='").append(numeAgentie).append('\'');
        sb.append(", capital=").append(capital);
        sb.append(", numarAngajati=").append(numarAngajati);
        sb.append('}');
        return sb.toString();
    }
}
