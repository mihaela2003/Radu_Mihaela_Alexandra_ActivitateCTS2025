package banca.flywieght.main;

import banca.flywieght.clase.FabricaConturi;
import banca.flywieght.clase.IDetinator;
import banca.flywieght.clase.Informatie;

public class Main {
    public static void main(String[] args) {
        FabricaConturi fabrica = new FabricaConturi();

        try {
            IDetinator detinator = fabrica.getInformatii("0987654321", "gigel", "fsdkj", "gigel@gmail.com");
            Informatie informatie = new Informatie(1,4575f);
            detinator.descriere(informatie);

            Informatie informatie1 = new Informatie(2,4536f);
            fabrica.getInformatii("1234567890", "ana", "fgfg","ana@gmail.com").descriere(informatie1);

            fabrica.getInformatii("0987654321").descriere(informatie1);
            detinator.descriere(informatie);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}