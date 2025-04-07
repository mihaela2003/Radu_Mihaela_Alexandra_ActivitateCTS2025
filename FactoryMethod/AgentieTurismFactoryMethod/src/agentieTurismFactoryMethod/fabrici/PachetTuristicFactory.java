package agentieTurismFactoryMethod.fabrici;

import agentieTurismFactoryMethod.clase.PachetTuristic;

public interface PachetTuristicFactory {
    PachetTuristic crearePachet(TipPachetTuristic tip);
}
