package stb.facade.clase;

public class UsaMijloc {
    public void deschidereFortaMijloc(Usa usa){
        System.out.println("usa din mijloc " + usa.getNume() + " a fost deschisa fortat.");
    }

    public void deschidereLiberMijloc(Usa usa){
        System.out.println("usa din mijloc " + usa.getNume() + " a fost deschisa liber");
    }
}
