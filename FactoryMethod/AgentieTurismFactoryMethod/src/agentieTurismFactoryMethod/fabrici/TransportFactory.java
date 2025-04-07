package agentieTurismFactoryMethod.fabrici;

import agentieTurismFactoryMethod.clase.PachetTuristic;
import agentieTurismFactoryMethod.clase.TransportAutobuz;
import agentieTurismFactoryMethod.clase.TransportMicrobuz;

public class TransportFactory implements PachetTuristicFactory{
    @Override
    public PachetTuristic crearePachet(TipPachetTuristic tip) {
        switch ((TipPachetTransport) tip){
            case AUTOBUZ -> {
                return new TransportAutobuz();
            }
            case MICROBUZ -> {
                return new TransportMicrobuz();
            }
            default -> {
                return null;
            }
        }
    }
}
