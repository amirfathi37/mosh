import java.util.Scanner;

public class ConsoleModel {
    private static Scanner scanner = new Scanner(System.in);

    public static double readNumber(String prompt, int min, int max) {

        double value = 0;
        while (true) {
            System.out.println(prompt);
            value = scanner.nextDouble();
            if (value < min || value > max) {
                System.out.println("wrong input, it must be between " + min + " and " + max);
                continue;
            }
            break;
        }
        return value;
    }
}
