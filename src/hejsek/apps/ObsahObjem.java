package hejsek.apps;

import java.util.Locale;
import java.util.Scanner;

public class ObsahObjem {
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

        double kvadr_objem = a * b * c;
        double a_krychle = Math.cbrt(kvadr_objem);
        double a_ctyrsten = Math.cbrt((12 * kvadr_objem) / (Math.sqrt(2)));
        double r = Math.cbrt((3 * kvadr_objem) / (4 * Math.PI));
        double plocha_kvadr = 2 * (a*b + b*c + a*c);
        double plocha_krychle = 6 * Math.pow(a, 2);
        double plocha_koule = 4 * Math.PI * Math.pow(r, 2);
        double plocha_ctyrsten = Math.sqrt(3 * Math.pow(a, 2));

        System.out.format(Locale.getDefault(), "Při zachování objemu kvádru (%.2f %s^3) činí rozměry pro:%n", kvadr_objem, jednotky);
        System.out.format(Locale.getDefault(), "Stranu krychle: %.2f %s%nStranu ctyrstenu: %.2f %s%nPoloměr koule: %.2f %s", a_krychle, jednotky, a_ctyrsten, jednotky, r, jednotky);
        System.out.format(Locale.getDefault(), "Plocha pro:%nKvádr: %.2f %s^2%nKrychli: %.2f %s^2%nKouli: %.2f %s^2%nČtyřstěn: %.2f %s^2%n", plocha_kvadr, jednotky, plocha_krychle, jednotky, plocha_koule, jednotky, plocha_ctyrsten, jednotky);
    }
}
