package agentieTurismFactoryMethod.main;

import agentieTurismFactoryMethod.clase.PachetTuristic;
import agentieTurismFactoryMethod.fabrici.*;

public class Main {
    public static void main(String[] args) {
        PachetTuristicFactory fabrica = new CazareFactory();
        PachetTuristicFactory fabricaTransport = new TransportFactory();

        PachetTuristic pachet = fabrica.crearePachet(TipPachetCazare.CABANA);
        pachet.afiseazaDescriere();
        pachet = fabricaTransport.crearePachet(TipPachetTransport.MICROBUZ);
        pachet.afiseazaDescriere();
    }
}