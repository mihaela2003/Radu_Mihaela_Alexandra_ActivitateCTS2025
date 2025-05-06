package restaurantFlyweight.clase;

import java.util.HashMap;

public class FabricaRezervari {
    private HashMap<Integer, IClient> listaClienti;

    public FabricaRezervari() {
        listaClienti = new HashMap<Integer, IClient>();
    }

    public IClient getRezervare(int codClient){
        if(listaClienti.containsKey(codClient)){
            return listaClienti.get(codClient);
        }
        else {
            IClient client = new Client(codClient, "Popescu", "07459595995", "popescu@gmail.com");
            listaClienti.put(codClient, client);
            return client;
        }
    }
}
