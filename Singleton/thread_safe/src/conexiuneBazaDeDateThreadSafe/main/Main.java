package conexiuneBazaDeDateThreadSafe.main;

import conexiuneBazaDeDateThreadSafe.clase.ConexiuneBazaDeDate;

public class Main {
    public static void main(String[] args){
        ConexiuneBazaDeDate conexiune1 = ConexiuneBazaDeDate.getInstance("CTS", 4, "ASDFGHJKL");
        System.out.println(conexiune1);
        ConexiuneBazaDeDate conexiune2 = ConexiuneBazaDeDate.getInstance("CTS2025", 4, "ASDFGHJKL");
        System.out.println(conexiune2);
    }
}
