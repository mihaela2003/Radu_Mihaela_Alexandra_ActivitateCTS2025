package stb.facade.clase;

public class UsaDinSpate {
    public void deschidereFortaSpate(Usa usa){
        System.out.println("usa din spate " + usa.getNume() + " a fost deschisa fortat.");
    }

    public void deschidereLiberSpate(Usa usa){
        System.out.println("usa din spate " + usa.getNume() + " a fost deschisa liber");
    }
}
