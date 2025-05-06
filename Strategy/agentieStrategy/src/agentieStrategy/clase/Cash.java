package agentieStrategy.clase;

public class Cash implements ModPlata{
    @Override
    public void plateste(String numeClient, double sumaPlatita) {
        System.out.println(numeClient + " plateste Cash suma de " + sumaPlatita);
    }
}
