package pacheteRegistry.clase;

import java.util.HashMap;
import java.util.Map;

public class PacheteRegistry {

    public PacheteRegistry() {
    }

    static Map<String, PachetTuristic> collection = new HashMap<>();

    public static void register(String name, PachetTuristic value) throws Exception {
        if (collection.containsKey(name)){
            throw new Exception("Key '" + name + "' already registeres");
        }
        else {
            collection.put(name, value);
        }
    }

    public static PachetTuristic getPachet(String name) {
        return collection.get(name);
    }
}
