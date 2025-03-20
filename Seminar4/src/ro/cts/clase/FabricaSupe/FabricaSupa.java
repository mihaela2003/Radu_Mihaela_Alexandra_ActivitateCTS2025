package ro.cts.clase.FabricaSupe;

import ro.cts.clase.Supa;
import ro.cts.clase.SupaCocos;
import ro.cts.clase.SupaLegume;
import ro.cts.clase.SupaVita;

public class FabricaSupa {
    private float pret;
    private float calorii;

    public FabricaSupa(float pret, float calorii) {
        this.pret = pret;
        this.calorii = calorii;
    }

    public Supa getSupe(TipSupa tip, float cantitate){
        switch (tip){
            case SUPALEGUME -> {
                SupaLegume supaLegume = new SupaLegume(pret, cantitate, calorii);
                return supaLegume;
            }
            case SUPAVITA -> {
                SupaVita supaVita = new SupaVita(pret, cantitate, calorii);
                return supaVita;
            }
            case SUPACOCOS -> {
                SupaCocos supaCocos = new SupaCocos(pret, cantitate, calorii);
                return supaCocos;
            }
            default -> {
                return null;
            }
        }
    }
}
