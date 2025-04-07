package agentieTurismSimpleFactory.clase;

public class AgentieFactory {
    public PachetTuristic createPachet(TipPachet tipPachet) throws Exception {
        switch (tipPachet){
            case CAZARE -> {
                return new PachetCazare();
            }
            case TRANSPORT -> {
                return new PachetTransport();
            }
            case CAZARE_TRANSPORT -> {
                return new PachetCazareTransport();
            }
            default -> throw new Exception("Tipul nu este corect");
        }
    }
}