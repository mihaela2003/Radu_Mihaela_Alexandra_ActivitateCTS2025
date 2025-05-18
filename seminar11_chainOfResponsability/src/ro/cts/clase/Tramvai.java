package ro.cts.clase;

public class Tramvai extends InfoMijloc{

    @Override
    public void recomandaMijloc(int distanta) {
        if (distanta < 10){
            System.out.println("Calatorul va alege tramvaiul");
        } else {
            this.getUrmMijloc().recomandaMijloc(distanta);
        }
    }
}
