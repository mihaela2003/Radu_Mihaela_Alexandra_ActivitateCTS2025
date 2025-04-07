package agentieTurismSimpleFactory.main;

import agentieTurismSimpleFactory.clase.AgentieFactory;
import agentieTurismSimpleFactory.clase.PachetTuristic;
import agentieTurismSimpleFactory.clase.TipPachet;

public class Main {
    public static void main(String[] args) {
        AgentieFactory agentieFactory = new AgentieFactory();
        try {
            PachetTuristic pachetCazare = agentieFactory.createPachet(TipPachet.CAZARE);
            PachetTuristic pachetTransport = agentieFactory.createPachet(TipPachet.TRANSPORT);
            PachetTuristic pachetCazareTransport = agentieFactory.createPachet(TipPachet.CAZARE_TRANSPORT);

            pachetCazare.descriere();
            pachetTransport.descriere();
            pachetCazareTransport.descriere();
        } catch (Exception exception){
            System.out.println("Tipul nu este corect");
        }
    }
}