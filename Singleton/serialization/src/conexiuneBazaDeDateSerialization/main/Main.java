package conexiuneBazaDeDateSerialization.main;

import conexiuneBazaDeDateSerialization.clase.ConexiuneBazaDeDate;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ConexiuneBazaDeDate conexiune = ConexiuneBazaDeDate.getInstance("CTS", 5, "asdfgfds");
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("conexiune.dat"));
        out.writeObject(conexiune);
        out.close();

        ObjectInput in = new ObjectInputStream(new FileInputStream("conexiune.dat"));
        ConexiuneBazaDeDate conexiune1 = (ConexiuneBazaDeDate) in.readObject();

        conexiune1.setNumeBaza("CTS2025");

        System.out.println(conexiune.getNumeBaza() + " " + conexiune.getNrTabele());
        System.out.println(conexiune1.getNumeBaza() + " " + conexiune1.getNrTabele());
    }
}
