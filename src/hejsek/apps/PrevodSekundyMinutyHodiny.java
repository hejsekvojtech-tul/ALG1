package hejsek.apps;

import java.util.Scanner;

public class PrevodSekundyMinutyHodiny {
    private static final Scanner vstup = new Scanner(System.in);
    final static byte POCET_MINUT_HODINY = 60;
    final static byte POCET_SEKUND_MINUTY = 60;
    final static short POCET_SEKUND_HODINY = POCET_SEKUND_MINUTY * POCET_MINUT_HODINY;

    private static void msg(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        msg("Zadej celkový počet sekund");
        long secCelkem = vstup.nextLong();

        int hod = (int) (secCelkem / POCET_SEKUND_HODINY);
        secCelkem = secCelkem % POCET_SEKUND_HODINY;
        int min = (int) (secCelkem / POCET_SEKUND_MINUTY);
        int sec = (int) (secCelkem % POCET_SEKUND_MINUTY);

        System.out.println(hod + ":" + min + ":" + sec);
    }
}
