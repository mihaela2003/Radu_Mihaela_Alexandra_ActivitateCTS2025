package sportiv.flywieght.main;

import sportiv.flywieght.clase.Caracteristica;
import sportiv.flywieght.clase.FabricaPersoane;
import sportiv.flywieght.clase.IPersoana;
import sportiv.flywieght.clase.Persoana;

public class Main {
    public static void main(String[] args) {
        FabricaPersoane fabrica = new FabricaPersoane();

        try{
            IPersoana persoana = new Persoana(1,155f, 34.5f);

            Caracteristica caracteristica = new Caracteristica("albastru", "tribuna nord", 17);
            Caracteristica caracteristica1 = new Caracteristica("galben", "tribuna sud", 4);

            persoana.descriere(caracteristica);
            fabrica.getPersoana(2,167f, 56.4f).descriere(caracteristica1);

            persoana.descriere(caracteristica1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}