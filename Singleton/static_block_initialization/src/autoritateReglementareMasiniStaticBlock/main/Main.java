package autoritateReglementareMasiniStaticBlock.main;

import autoritateReglementareMasiniStaticBlock.clase.AutoritateReglementareMasini;

public class Main {
    public static void main(String[] args){
        AutoritateReglementareMasini autoritate1 = AutoritateReglementareMasini.getInstance();
        System.out.println(autoritate1);
        AutoritateReglementareMasini autoritate2 = AutoritateReglementareMasini.getInstance();
        autoritate2.setNrReglementari(200);
        System.out.println(autoritate2);
        System.out.println(autoritate1);
    }
}
