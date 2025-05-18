package farmacie.flyweight.main;

import farmacie.flyweight.clase.FabricaRetete;
import farmacie.flyweight.clase.IClient;
import farmacie.flyweight.clase.Reteta;

public class Main {
    public static void main(String[] args) {
        FabricaRetete fabrica = new FabricaRetete();

        try{
            IClient client = fabrica.getRetete(1,"gigel", 234);
            Reteta reteta1 = new Reteta(1,34f,3);
            Reteta reteta2 = new Reteta(2,45f,3);

            client.descriere(reteta1);
            client.descriere(reteta2);

            Reteta reteta3 = new Reteta(3,46f,2);
            Reteta reteta4 = new Reteta(4,56f,1);

            fabrica.getRetete(2,"costel", 342).descriere(reteta3);
            fabrica.getRetete(1).descriere(reteta4);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}