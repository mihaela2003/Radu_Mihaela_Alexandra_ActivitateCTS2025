package agentieStrategy.clase;

public class Card implements ModPlata{
    @Override
    public void plateste(String numeClient, double sumaPlatita) {
        System.out.println(numeClient + " plateste folosind Cardul suma de " + sumaPlatita);
    }
}
