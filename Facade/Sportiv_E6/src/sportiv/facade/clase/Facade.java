package sportiv.facade.clase;

public class Facade {
    public String validator(Persoana persoana){
        Bilet bilet =  new Bilet("gigel");
        Politie politie = new Politie(false);
        Stadion stadion = new Stadion(true);

        if (bilet.verificareNumeBilet(persoana)){
            if(!politie.isaFostCautat()){
                if(!stadion.isAreAntecendente()){
                    return "puteti intra pe stadion";
                } else {
                    return "aveti antecedente pe alte stadioane, nu va putem lasa sa intrati";
                }
            } else {
                return "ati fost urmarit de politie, nu va putem lasa sa intrati";
            }
        } else {
            return "pe bilet nu se afla numele dumneavoastra, nu va putem lasa sa intrati";
        }
    }
}
