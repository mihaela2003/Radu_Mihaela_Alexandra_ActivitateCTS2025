package agentieTurismFactoryMethod.fabrici;

import agentieTurismFactoryMethod.clase.CazareCabana;
import agentieTurismFactoryMethod.clase.CazareHotel;
import agentieTurismFactoryMethod.clase.PachetTuristic;

public class CazareFactory implements PachetTuristicFactory{
    @Override
    public PachetTuristic crearePachet(TipPachetTuristic tip) {
        switch ((TipPachetCazare) tip){
            case HOTEL -> {
                return new CazareHotel();
            }
            case CABANA -> {
                return new CazareCabana();
            }
            default -> {
                return null;
            }
        }
    }
}
