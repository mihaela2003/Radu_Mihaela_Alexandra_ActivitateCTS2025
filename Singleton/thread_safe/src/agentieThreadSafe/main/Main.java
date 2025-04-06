package agentieThreadSafe.main;

import agentieThreadSafe.clase.Agentie;

public class Main {
    public static void main(String[] args) {
        Agentie agentie = Agentie.getInstance("CTS", 1300, 10);
        System.out.println(agentie);
        Agentie agentie1 = Agentie.getInstance("CTS2025", 1499, 10);
        System.out.println(agentie1);
    }
}