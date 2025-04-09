package serviceAuto.main;

import serviceAuto.SimpleFactory.factory.FactoryAMasina;
import serviceAuto.SimpleFactory.factory.TipMasina;
import serviceAuto.Singleton.AMasina;
import serviceAuto.Singleton.Masina;
import serviceAuto.Singleton.Service;

public class Main {
    public static void main(String[] args) {
        AMasina masina = new Masina("Audi", "A5", "AG23RAM", 2018);
        Service service = Service.getInstance("Service1", "Bucuresti", 10, masina);
        service.descriere();

        AMasina masina1 = new Masina("Dacia", "Logan", "IF17GHS", 2020);
        service.setMasina(masina1);
        service.descriere();

        AMasina masina2 = new Masina("Audi", "A7", "VL13FSF", 2021);
        service.setMasina(masina2);
        service.descriere();

        AMasina masina3 = new Masina("Tesla", "...", "dh65jdg", 2022);
        service.setMasina(masina3);
        service.descriere();

        Service service1 = Service.getInstance("Service2", "Buzau", 12, masina);
        service1.descriere();

        System.out.println("\n");

        FactoryAMasina factoryAMasina = new FactoryAMasina();
        AMasina suv = factoryAMasina.creareMasina(TipMasina.SUV, "Jeep", "X", "AH47SHF", 2023);
        System.out.println(suv);

        AMasina sedan = factoryAMasina.creareMasina(TipMasina.SEDAN, "xxx", "f", "sfsfs", 2013);
        System.out.println(sedan);

        FactoryAMasina factoryAMasina1 = new FactoryAMasina();
        AMasina van = factoryAMasina1.creareMasina(TipMasina.VAN, "fghj", "fgh", "fghj", 2023);
        System.out.println(van);

        AMasina sedan1 = factoryAMasina1.creareMasina(TipMasina.SEDAN, "fghj", "vbnm", "hjjh", 2024);
        System.out.println(sedan1);






    }
}