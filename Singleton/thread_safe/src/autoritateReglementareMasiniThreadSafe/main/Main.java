package autoritateReglementareMasiniThreadSafe.main;

import autoritateReglementareMasiniThreadSafe.clase.AutoritateReglementareMasini;

public class Main {
    public static void main(String[] args){
        AutoritateReglementareMasini autoritate1 = AutoritateReglementareMasini.getInstance("autoritate1", "www.website.ro", 200);
        System.out.println(autoritate1);
        AutoritateReglementareMasini autoritate2 = AutoritateReglementareMasini.getInstance("autoritate1", "www.siteNou.ro", 200);
        System.out.println(autoritate2);
        System.out.println(autoritate1);
    }
}
