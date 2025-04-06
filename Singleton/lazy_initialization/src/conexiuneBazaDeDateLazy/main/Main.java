package conexiuneBazaDeDateLazy.main;

import conexiuneBazaDeDateLazy.clase.ConexiuneBazaDeDate;

public class Main {
    public static void main(String[] args){
        ConexiuneBazaDeDate conexiune1 = ConexiuneBazaDeDate.getInstance("CTS", 2,"asdfghjkl");
        System.out.println(conexiune1);
        ConexiuneBazaDeDate conexiune2 = ConexiuneBazaDeDate.getInstance("CTS", 7, "qwertyuiop");
        System.out.println(conexiune2);
    }
}
