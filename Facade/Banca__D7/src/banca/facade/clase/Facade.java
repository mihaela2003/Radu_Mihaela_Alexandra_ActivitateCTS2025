package banca.facade.clase;

public class Facade {
    public String verificareCreareCont(Persoana persoana){
        Banca banca = new Banca(false);
        Politie politie = new Politie(false);

        if(persoana.verificaVarsta()){
            if(!politie.isEsteUrmarit()){
                if(!banca.isAreCreante()){
                    return "va puteti crea cont la banca noastra";
                } else {
                    return "aveti creante la alte banci nu va putem crea cont la aceasta banca";
                }
            } else {
                return "sunteti urmarit de politie, nu va putem crea cont";
            }
        } else {
            return " nu sunteti majori, nu va putem crea cont";
        }
    }
}
