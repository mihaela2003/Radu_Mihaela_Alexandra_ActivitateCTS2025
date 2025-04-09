package serviceAuto.main;

import serviceAuto.prototype.AbstractSticker;
import serviceAuto.prototype.IMasina;
import serviceAuto.prototype.Masina;
import serviceAuto.prototype.Sticker;
import serviceAuto.simpleFactory.clase.IComponenta;
import serviceAuto.simpleFactory.factory.FactoryComponentaAuto;
import serviceAuto.simpleFactory.factory.TipComponenta;

public class Main {
    public static void main(String[] args) {
        IMasina masina = new Masina("dacia", 2023);
        AbstractSticker sticker = new Sticker("negru", masina);
        System.out.println(sticker);

        AbstractSticker clona = sticker.copiaza(masina);
        System.out.println(clona);

        IMasina masina1 = new Masina("tesla", 2022);
        AbstractSticker sticker1 = new Sticker("alb", masina1);
        System.out.println(sticker1);

        AbstractSticker clona1 = sticker1.copiaza(masina1);
        System.out.println(clona1);

        System.out.println("\n");

        FactoryComponentaAuto factory = new FactoryComponentaAuto();
        IComponenta bara = factory.creazaComponenta(TipComponenta.BARA, "laterala");
        bara.descriere();

        IComponenta capota = factory.creazaComponenta(TipComponenta.CAPOTA,"mov");
        capota.descriere();

        FactoryComponentaAuto factory2 = new FactoryComponentaAuto();
        IComponenta portbagaj = factory2.creazaComponenta(TipComponenta.PORTBAGAJ, "240L");
        portbagaj.descriere();

        IComponenta usa = factory2.creazaComponenta(TipComponenta.USA, "mov");
        usa.descriere();
    }
}