import java.util.Scanner;

public class SoucetSoucin {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        System.out.printf("%d %d", number1+number2, number1*number2);
    }
}