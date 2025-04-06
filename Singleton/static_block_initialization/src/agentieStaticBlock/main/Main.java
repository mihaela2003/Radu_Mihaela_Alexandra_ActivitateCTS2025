package agentieStaticBlock.main;

import agentieStaticBlock.clase.AgentieStaticBlock;

public class Main {
    public static void main(String[] args) {
        AgentieStaticBlock agentie1 = AgentieStaticBlock.getInstance();
        System.out.println(agentie1);
        AgentieStaticBlock agentie2 = AgentieStaticBlock.getInstance();
        agentie2.setNumeAgentie("CTS2025");
        System.out.println(agentie2);
        System.out.println(agentie1);
    }
}