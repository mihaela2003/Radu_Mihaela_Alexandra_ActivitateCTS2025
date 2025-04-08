package farmaciePrototype.clase;

import java.util.HashMap;
import java.util.Map;

public class RetetaMedicament extends RetetaAbstract {
    private String denumireMedicament;
    private Map<String, Double> cantitatiSolutii;

    public RetetaMedicament() {
        super();
    }

    public RetetaMedicament(String numeChimist, String codReteta, String denumireMedicament, Map<String, Double> cantitatiSolutii) {
        super(numeChimist, codReteta);
        this.denumireMedicament = denumireMedicament;
        this.cantitatiSolutii = cantitatiSolutii;
    }

    public void setCantitatiSolutii(Map<String, Double> cantitatiSolutii) {
        this.cantitatiSolutii = new HashMap<>();
        for (String cantitati: cantitatiSolutii.keySet()){
            this.cantitatiSolutii.put(cantitati, cantitatiSolutii.get(cantitati));
        }
    }

    @Override
    public RetetaAbstract copiaza(String denumireMedicament) {
        RetetaMedicament retetaMedicament = new RetetaMedicament();
        retetaMedicament.numeChimist = this.numeChimist;
        retetaMedicament.codReteta = this.codReteta;
        retetaMedicament.denumireMedicament = this.denumireMedicament;
        retetaMedicament.setCantitatiSolutii(this.cantitatiSolutii);
        return retetaMedicament;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RetetaMedicament{");
        sb.append("denumireMedicament='").append(denumireMedicament).append('\'');
        sb.append(", cantitatiSolutii=").append(cantitatiSolutii);
        sb.append(", numeChimist='").append(numeChimist).append('\'');
        sb.append(", codReteta='").append(codReteta).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
