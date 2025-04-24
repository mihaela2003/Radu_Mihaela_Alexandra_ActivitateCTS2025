package ro.cts.clase;

public class Receptionist {
    public String poateLuaLocLaMasa(Masa masa){
        Ospatar ospatar = new Ospatar();
        Picolo picolo = new Picolo();

        if (masa.isEsteLibera()){
            if (picolo.esteDebarasata(masa)){
                if (ospatar.esteAranjataMasa(masa)){
                    return "Va rog luati loc la masa " + masa.getNumarulMasa();
                } else {
                    return "Asteptati putin sa aranjam masa";
                }
            } else {
                return "Asteptati putin! Tocmai s-a ridicat cineva";
            }
        } else {
            return "Momentan masa " + masa.getNumarulMasa() + " nu este disponibila";
        }
    }
}
