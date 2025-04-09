package cinematograf.main;

import cinematograf.clase.AbstractTicket;
import cinematograf.clase.BiletFilm;

public class Main {
    public static void main(String[] args) {
        AbstractTicket ticket = new BiletFilm("Mirror mirror", "alba ca zapada", false, "25.07.2023", 12, "23G");
        System.out.println(ticket);

        AbstractTicket clona = ticket.copiaza("mirror mirror");
        System.out.println(clona);

    }
}