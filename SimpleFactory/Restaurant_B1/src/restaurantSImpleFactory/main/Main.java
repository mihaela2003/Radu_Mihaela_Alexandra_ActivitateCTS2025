package restaurantSImpleFactory.main;

import restaurantSImpleFactory.clase.Supa;
import restaurantSImpleFactory.clase.SupaFactory;
import restaurantSImpleFactory.clase.TipSupa;

public class Main {
    public static void main(String[] args) {
        SupaFactory supaFactory = new SupaFactory(20.5f, 400);
        Supa supaLegume = supaFactory.getSupa(TipSupa.LEGUME, 300);
        Supa supaCiuperci = supaFactory.getSupa(TipSupa.CIUPERCI, 320);
        Supa supaVita = supaFactory.getSupa(TipSupa.VITA, 400);

        supaLegume.descriere();
        supaCiuperci.descriere();
        supaVita.descriere();
    }
}