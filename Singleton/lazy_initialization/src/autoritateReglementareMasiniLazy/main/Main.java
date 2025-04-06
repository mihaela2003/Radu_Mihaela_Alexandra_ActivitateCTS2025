package autoritateReglementareMasiniLazy.main;

import autoritateReglementareMasiniLazy.clase.AutoritateReglementareMasiniLazy;

public class Main {
    public static void main(String[] args){
        AutoritateReglementareMasiniLazy autoritate1 = AutoritateReglementareMasiniLazy.getInstance("autoritate1", "www.website.ro");
        System.out.println(autoritate1);
        AutoritateReglementareMasiniLazy autoritate2 = AutoritateReglementareMasiniLazy.getInstance("autoritate1", "www.siteNou.ro");
        System.out.println(autoritate2);
        System.out.println(autoritate1);

        autoritate2.reglementeazaMasina("autoritate1");
        System.out.println(autoritate2);
        System.out.println(autoritate1);
    }
}
