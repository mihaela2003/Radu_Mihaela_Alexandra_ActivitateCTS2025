package ro.cts.program;

import ro.cts.clase.AgentieLazy;

public class Main {
    public static void main(String[] args) {
        AgentieLazy agentieLazy = AgentieLazy.getInstance("AgeTur", 1000,5);
        System.out.println(agentieLazy);

        AgentieLazy agentieLazy1 = AgentieLazy.getInstance("AgeTur", 1500,5);
        agentieLazy1.setCapital(1500);
        System.out.println(agentieLazy1);
        System.out.println(agentieLazy);
    }
}