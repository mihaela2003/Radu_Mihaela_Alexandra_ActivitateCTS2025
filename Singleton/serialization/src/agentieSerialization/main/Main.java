package agentieSerialization.main;

import agentieSerialization.clase.Agentie;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Agentie agentie = Agentie.getInstance("Nume1", 1000, 10);
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("agentie.dat"));
        out.writeObject(agentie);
        out.close();

        ObjectInput in = new ObjectInputStream(new FileInputStream("agentie.dat"));
        Agentie agentie2 = (Agentie) in.readObject();

        agentie2.setNumeAgentie("Nume2");
        agentie2.setCapital(2000);
        agentie2.setNumarAngajati(200);

        System.out.println(agentie.getNumeAgentie() + " " + agentie.getCapital());
        System.out.println(agentie2.getNumeAgentie() + " " + agentie2.getCapital());
    }
}