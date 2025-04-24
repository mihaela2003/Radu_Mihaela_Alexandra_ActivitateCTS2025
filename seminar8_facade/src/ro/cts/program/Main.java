package ro.cts.program;

import ro.cts.clase.Masa;
import ro.cts.clase.Ospatar;
import ro.cts.clase.Picolo;
import ro.cts.clase.Receptionist;

public class Main {
    public static void main(String[] args) {
        Masa masa = new Masa(true, 20,4);
        Receptionist receptionist = new Receptionist();
        String mesaj1 = receptionist.poateLuaLocLaMasa(masa);
        System.out.println(mesaj1);

        Masa masa1 = new Masa(true, 23, 5);
        System.out.println(receptionist.poateLuaLocLaMasa(masa1));

        Masa masa2 = new Masa(true, 4, 4);
        System.out.println(receptionist.poateLuaLocLaMasa(masa2));
    }
}