package agentieSerialization.clase;

import java.io.Serializable;

public class Agentie implements Serializable {
    private String numeAgentie;
    private float capital;
    private int numarAngajati;
    private static Agentie instance = null;

    public static Agentie getInstance(String numeAgentie, float capital, int numarAngajati){
        if (instance == null) {
            instance = new Agentie(numeAgentie, capital, numarAngajati);
        }
        return instance;
    }

    protected Object readResolve(){
        return getInstance("Nu conteaza", 0 ,0);
    }

    public Agentie(String numeAgentie, float capital, int numarAngajati) {
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

}
