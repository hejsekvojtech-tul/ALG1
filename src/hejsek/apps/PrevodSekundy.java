package hejsek.apps;

import java.util.Scanner;

public class PrevodSekundy {
    private static final Scanner vstup = new Scanner(System.in);
    final static byte POCET_MINUT_HODINY = 60;
    final static byte POCET_SEKUND_MINUTY = 60;
    final static short POCET_SEKUND_HODINY = POCET_SEKUND_MINUTY * POCET_MINUT_HODINY;

    private static void msg(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        msg("Zadej počet hodin");
        int hod = vstup.nextInt();
        msg("Zadej počet minut");
        int min = vstup.nextInt();
        msg("Zadej počet sekund");
        int sec = vstup.nextInt();

        System.out.format("Zadaný čas je %d hodin, %d minut a %d sekund%n", hod, min, sec);
        long secCelkem;
        secCelkem = hod * POCET_SEKUND_HODINY + min * POCET_SEKUND_MINUTY + sec;
        System.out.format("Celkový počet sekund %d%n", secCelkem);
        vstup.close();
    }
}
