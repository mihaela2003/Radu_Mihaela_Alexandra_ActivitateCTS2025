package pacheteRegistry.main;

import pacheteRegistry.clase.PachetCazare;
import pacheteRegistry.clase.PachetTransport;
import pacheteRegistry.clase.PachetTuristic;
import pacheteRegistry.clase.PacheteRegistry;

public class Main {
    public static void main(String[] args) {
        PachetTuristic cazare = new PachetCazare();
        PachetTuristic cazare1 = new PachetCazare();
        PachetTuristic transport = new PachetTransport();

        try {
            PacheteRegistry.register("Cazare", cazare);
            PacheteRegistry.register("Transport", transport);
           // PacheteRegistry.register("Cazare", cazare1);

            PacheteRegistry.getPachet("Cazare").descriere();
            PacheteRegistry.getPachet("Transport").descriere();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}