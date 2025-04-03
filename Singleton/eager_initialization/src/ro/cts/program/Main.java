package ro.cts.program;

import ro.cts.clase.AgentieEager;

public class Main {
    public static void main(String[] args) {
        AgentieEager agentieEager = AgentieEager.getInstance();
        System.out.println(agentieEager);

        AgentieEager agentieEager1 = AgentieEager.getInstance();
        agentieEager1.setNumeAgentie("AgentieCTS");
        System.out.println(agentieEager1);
        System.out.println(agentieEager);
    }
}