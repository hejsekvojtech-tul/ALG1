package hejsek.apps;

import java.util.Scanner;

public class UsekovaRychlost {
    private static short speed_limit;
    private static float section_length;
    private static byte hh_start, mm_start, ss_start, set_start, hh_end, mm_end, ss_end, set_end;
    private final static byte POCET_MINUT_HODINY = 60;
    private final static byte POCET_SEKUND_MINUTY = 60;
    private final static short POCET_MILISEKUND_SEKUNDY = 1000;
    private final static short POCET_SEKUND_HODINY = POCET_SEKUND_MINUTY * POCET_MINUT_HODINY;

    private static void msg(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        msg("Zadejte rychlostní limit úseku:");
        speed_limit = input.nextShort();
        msg("Zadejte délku měřeného úseku v metrech:");
        section_length = input.nextLong();
        msg("Zadejte čas začátku měření rychlosti v úseku:");
        msg("Hodiny:");
        hh_start = input.nextByte();
        msg("Minuty:");
        mm_start = input.nextByte();
        msg("Sekundy:");
        ss_start = input.nextByte();
        msg("Setiny:");
        set_start = input.nextByte();
        msg("Zadejte čas konce měření rychlosti v úseku:");
        msg("Hodiny:");
        hh_end = input.nextByte();
        msg("Minuty:");
        mm_end = input.nextByte();
        msg("Sekundy:");
        ss_end = input.nextByte();
        msg("Setiny:");
        set_end = input.nextByte();

        long start_time_in_ms = (hh_start * POCET_SEKUND_HODINY + mm_start * POCET_SEKUND_MINUTY + ss_start) * POCET_MILISEKUND_SEKUNDY + set_start * 10;
        long end_time_in_ms = (hh_end * POCET_SEKUND_HODINY + mm_end * POCET_SEKUND_MINUTY + ss_end) * POCET_MILISEKUND_SEKUNDY + set_end * 10;
        float elapsed_time_in_hours = (end_time_in_ms - start_time_in_ms) / (float) (POCET_MILISEKUND_SEKUNDY * POCET_SEKUND_HODINY);
        float speed = (section_length / 1000) / elapsed_time_in_hours;
        float overspeed = speed - (float) speed_limit;

        int pokuta = 0;
        int strzene_body = 0;

        if (overspeed > 0 && overspeed <= 5) {
            pokuta = 1000;
            strzene_body = 0;
        } else if (overspeed > 5 && overspeed <= 20) {
            pokuta = 1000;
            strzene_body = 2;
        } else if (overspeed > 20) {
            pokuta = 2500;
            strzene_body = 3;
        }
        System.out.format("Pokuta ve výši %d Kč%nStržených bodů: %d", pokuta, strzene_body);
    }
}