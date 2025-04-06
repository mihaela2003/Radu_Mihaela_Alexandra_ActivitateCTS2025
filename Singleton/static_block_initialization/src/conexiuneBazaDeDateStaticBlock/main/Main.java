package conexiuneBazaDeDateStaticBlock.main;

import conexiuneBazaDeDateStaticBlock.clase.ConexiuneBazaDeDate;

public class Main {
    public static void main(String[] args){
        ConexiuneBazaDeDate conexiune1 = ConexiuneBazaDeDate.getInstance();
        System.out.println(conexiune1);
        ConexiuneBazaDeDate conexiune2 = ConexiuneBazaDeDate.getInstance();
        conexiune2.setNrTabele(10);
        System.out.println(conexiune2);
        System.out.println(conexiune1);
    }
}
