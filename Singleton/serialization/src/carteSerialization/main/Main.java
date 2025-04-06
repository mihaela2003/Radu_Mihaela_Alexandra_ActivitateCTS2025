package carteSerialization.main;

import carteSerialization.clase.Carte;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Carte carte = Carte.getInstance("A little life", 723, "Hanya");
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("carte.dat"));
        out.writeObject(carte);
        out.close();

        ObjectInput in = new ObjectInputStream(new FileInputStream("carte.dat"));
        Carte carte1 = (Carte) in.readObject();

        carte1.setNrPagini(832);
        carte1.setAutor("Hanya Yanagihara");

        System.out.println(carte.getTitlu() + " " + carte.getNrPagini() + " " + carte.getAutor());
        System.out.println(carte1.getTitlu() + " " + carte1.getNrPagini() + " " + carte1.getAutor());
    }
}
