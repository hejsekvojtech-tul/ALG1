package hejsek.apps;

import java.util.Scanner;

public class TestICO {
    private static  final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Zadejte IČO");
        int ico = input.nextInt();

        if (String.valueOf(ico).length() != 8) {
            System.out.println("Nespletl jste si čísla?");
            System.exit(0);
        }

        int n1 = (ico/10000000) * 8;
        int n2 = ((ico % 10000000) / 1000000) * 7;
        int n3 = ((ico % 1000000) / 100000) * 6;
        int n4 = ((ico % 100000) / 10000) * 5;
        int n5 = ((ico % 10000) / 1000) * 4;
        int n6 = ((ico % 1000) / 100) * 3;
        int n7 = ((ico % 100) / 10) * 2;
        int sum = n1 + n2 + n3 + n4 + n5 + n6 + n7;
        int remainder = sum % 11;
        int lastNumber = ico % 10;
        int tmpNumber;

        if (remainder == 0) {
            tmpNumber = 1;
        } else if (remainder == 1) {
            tmpNumber = 0;
        } else {
            tmpNumber = 11 - remainder;
        }
        System.out.format("Zadané IČO %s platné", (tmpNumber == lastNumber)?"je":"není");
    }
}
