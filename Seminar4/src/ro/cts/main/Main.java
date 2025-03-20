package ro.cts.main;

import ro.cts.clase.FabricaSupe.FabricaSupa;
import ro.cts.clase.FabricaSupe.TipSupa;
import ro.cts.clase.Supa;
import ro.cts.clase.SupaLegume;

public class Main {
    public static void main(String[] args) {
        FabricaSupa fabricaSupa = new FabricaSupa(15.99f, 58.99f);
        Supa supaLegume = fabricaSupa.getSupe(TipSupa.SUPALEGUME, 300);
        Supa supaVita = fabricaSupa.getSupe(TipSupa.SUPAVITA, 350);
        Supa supaCocos = fabricaSupa.getSupe(TipSupa.SUPACOCOS, 360);

        supaLegume.afiseazaDescriere();
        supaVita.afiseazaDescriere();
        supaCocos.afiseazaDescriere();
    }
}