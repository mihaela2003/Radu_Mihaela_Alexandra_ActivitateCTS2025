package ro.cts.program;

import ro.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        InfoMijloc autobuz = new Autobuz();
        InfoMijloc troleibuz = new Troleibuz();
        InfoMijloc tramvai = new Tramvai();
        InfoMijloc metrou = new Metrou();

        troleibuz.setUrmMijloc(autobuz);
        autobuz.setUrmMijloc(tramvai);
        tramvai.setUrmMijloc(metrou);
        metrou.setUrmMijloc(null);

        troleibuz.recomandaMijloc(5);
        troleibuz.recomandaMijloc(2);
        troleibuz.recomandaMijloc(12);
        troleibuz.recomandaMijloc(4);
        troleibuz.recomandaMijloc(7);

    }
}