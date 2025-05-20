package stb.facade.clase;

public class Facade {
    public void deschidereFortata(Usa usa){
        UsaDinFata usaDinFata = new UsaDinFata();
        UsaDinSpate usaDinSpate = new UsaDinSpate();
        UsaMijloc usaMijloc = new UsaMijloc();

        usaDinFata.deschidereFortaFata(usa);
        usaMijloc.deschidereFortaMijloc(usa);
        usaDinSpate.deschidereFortaSpate(usa);
    }

    public void deschidereLiber(Usa usa){
        UsaDinFata usaDinFata = new UsaDinFata();
        UsaDinSpate usaDinSpate = new UsaDinSpate();
        UsaMijloc usaMijloc = new UsaMijloc();

        usaDinFata.deschidereLiberFata(usa);
        usaMijloc.deschidereLiberMijloc(usa);
        usaDinSpate.deschidereLiberSpate(usa);
    }
}
