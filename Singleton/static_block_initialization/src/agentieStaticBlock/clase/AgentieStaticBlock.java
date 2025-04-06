package agentieStaticBlock.clase;

public class AgentieStaticBlock {
    private String numeAgentie;
    private float capital;
    private int numarAngajati;
    private static AgentieStaticBlock instance;

    static {
        try{
            instance = new AgentieStaticBlock("CTS", 1300, 7);
        } catch (Exception exception){
            System.out.println("Agentia nu poate fi creata");
        }
    }

    public AgentieStaticBlock(String numeAgentie, float capital, int numarAngajati) {
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

    public static AgentieStaticBlock getInstance(){
        return instance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AgentieStaticBlock{");
        sb.append("numeAgentie='").append(numeAgentie).append('\'');
        sb.append(", capital=").append(capital);
        sb.append(", numarAngajati=").append(numarAngajati);
        sb.append('}');
        return sb.toString();
    }
}
