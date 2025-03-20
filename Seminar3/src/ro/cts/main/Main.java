package ro.cts.main;

import ro.cts.clase.AutoritateReglementareMasiniEager;
import ro.cts.clase.AutoritateReglementareMasiniLazy;

public class Main {
    public static void main(String[] args) {
        //eager
        AutoritateReglementareMasiniEager autoritate = AutoritateReglementareMasiniEager.getInstance();
        System.out.println(autoritate);

        AutoritateReglementareMasiniEager autoritate2 = AutoritateReglementareMasiniEager.getInstance();
        autoritate2.setWebSite("www.siteNou.com");
        System.out.println(autoritate2);

        System.out.println(autoritate);

        autoritate2.reglementeazaModel("DaciaLogan");
        System.out.println(autoritate2);
        System.out.println(autoritate);

        //lazy
        AutoritateReglementareMasiniLazy autoL = AutoritateReglementareMasiniLazy.getInstance("AutoritateAuto", "www.websitel.ro");
        System.out.println(autoL);

        AutoritateReglementareMasiniLazy autoL2 = AutoritateReglementareMasiniLazy.getInstance("AutoritateAuto", "www.audi.com");
        System.out.println(autoL2);
    }
}