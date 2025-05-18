package farmacie.flyweight.clase;

import java.util.HashMap;

public class FabricaRetete {
    private HashMap<Integer, IClient> listaRetete;

    public FabricaRetete() {
        listaRetete = new HashMap<Integer, IClient>();
    }

    public IClient getRetete(int codClient) throws Exception {
        IClient client = listaRetete.get(codClient);
        if (client == null){
            throw new Exception("nu exista clientul");
        }
        else {
            return client;
        }
    }

    public IClient getRetete(int codClient, String nume, int numarAsigurare){
        IClient client = listaRetete.get(codClient);
        if(client==null){
            client = new Client(codClient, nume, numarAsigurare);
            listaRetete.put(codClient, client);
        }
        return client;
    }
}
