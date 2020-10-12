package hejsek.apps;

import java.util.Locale;
import java.util.Scanner;

public class VypocetGeomTeles {
    public static void main(String[] args) {
        double a, b, c;
        String jednotky;

        Scanner input = new Scanner(System.in);

        System.out.println("Zadejte jednotky:");
        jednotky = input.next();
        System.out.println("Zadejte stranu a:");
        a = input.nextDouble();
        System.out.println("Zadejte stranu b:");
        b = input.nextDouble();
        System.out.println("Zadejte stranu c:");
        c = input.nextDouble();

        // Kvádr
        double objem = a * b * c;
        double plocha = 2 * (a * b + b * c + a * c);

        double a_krychle = Math.cbrt(objem);
        double a_ctyrsten = Math.cbrt((12 * objem) / (Math.sqrt(2)));
        double r = Math.cbrt((3 * objem) / (4 * Math.PI));

        System.out.format(Locale.getDefault(), "Při zachování objemu kvádru (%.2f %s^3) činí rozměry pro:%n", objem, jednotky);
        System.out.format(Locale.getDefault(), "Stranu krychle: %.2f %s%nStranu ctyrstenu: %.2f %s%nPoloměr koule: %.2f %s%n", a_krychle, jednotky, a_ctyrsten, jednotky, r, jednotky);

        a_krychle = Math.sqrt(plocha / 6);
        a_ctyrsten = Math.sqrt(plocha / Math.sqrt(3));
        r = Math.sqrt(plocha / (4 * Math.PI));

        System.out.format(Locale.getDefault(), "Při zachování plochy kvádru (%.2f %s^2) činí rozměry pro:%n", plocha, jednotky);
        System.out.format(Locale.getDefault(), "Stranu krychle: %.2f %s%nStranu ctyrstenu: %.2f %s%nPoloměr koule: %.2f %s%n", a_krychle, jednotky, a_ctyrsten, jednotky, r, jednotky);
    }
}
