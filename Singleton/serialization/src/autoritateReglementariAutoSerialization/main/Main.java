package autoritateReglementariAutoSerialization.main;

import autoritateReglementariAutoSerialization.clase.AutoritateReglementariAuto;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        AutoritateReglementariAuto autoritate = AutoritateReglementariAuto.getInstance("autoritate1", "www.website.ro", 200);
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("autoritate.dat"));
        out.writeObject(autoritate);
        out.close();

        ObjectInput in = new ObjectInputStream(new FileInputStream("autoritate.dat"));
        AutoritateReglementariAuto autoritate2 = (AutoritateReglementariAuto) in.readObject();

        autoritate2.setNume("autoritate2");
        autoritate2.setWebsite("www.siteNou.ro");
        autoritate2.setNrReglementari(150);

        System.out.println(autoritate.getNume() + " " + autoritate.getWebsite());
        System.out.println(autoritate2.getNume() + " " + autoritate2.getWebsite());
    }
}
