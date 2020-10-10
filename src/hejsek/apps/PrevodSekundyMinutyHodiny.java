package hejsek.apps;

import java.util.Scanner;

public class PrevodSekundyMinutyHodiny {
    private static final Scanner input = new Scanner(System.in);
    private final static byte POCET_MINUT_HODINY = 60;
    private final static byte POCET_SEKUND_MINUTY = 60;
    private final static short POCET_SEKUND_HODINY = POCET_SEKUND_MINUTY * POCET_MINUT_HODINY;

    private static void msg(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        msg("Zadej celkový počet sekund:");
        long secCelkem = input.nextLong();

        int hod = (int) (secCelkem / POCET_SEKUND_HODINY);
        secCelkem = secCelkem % POCET_SEKUND_HODINY;
        int min = (int) (secCelkem / POCET_SEKUND_MINUTY);
        int sec = (int) (secCelkem % POCET_SEKUND_MINUTY);
        input.close();

        System.out.println(hod + ":" + min + ":" + sec);
    }
}
