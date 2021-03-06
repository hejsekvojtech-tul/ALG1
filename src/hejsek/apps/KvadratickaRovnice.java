package hejsek.apps;

import java.util.Scanner;

public class KvadratickaRovnice {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double a, b, c = 0;

        System.out.println("Zadejte koeficienty a b c%n");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Tohle není platná rovnice");
            } else {
                double x = -c / b;
                System.out.format("Řešení rovnice: x = %.5f", x);
            }
        } else {
            double d = Math.pow(b, 2) * (-4 * a * c);
            double d2 = Math.sqrt(Math.abs(d));

            if (d < 0) {
                double re = -b / (2 * a);
                double im = Math.abs(d2 / (2 * a));
                System.out.format("x1 = %.5f + %.5f%n", re, im);
                System.out.format("x2 = %.5f - %.5f", re, im);
            } else {
                double x1 = (-b + d2) / (2 * a);
                double x2 = (-b - d2) / (2 * a);
                System.out.format("x1 = %.5f%n", x1);
                System.out.format("x2 = %.5f", x2);
            }
        }
    }
}
