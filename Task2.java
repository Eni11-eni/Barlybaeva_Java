import java.util.Scanner;

public class Task2 {

    public static String compareStrings(String a, String b) {
        if (a == null && b == null) {
            return "Строки идентичны";
        }
        if (a == null || b == null) {
            return "Строки неидентичны";
        }
        if (a.equals(b)) {
            return "Строки идентичны";
        } else {
            return "Строки неидентичны";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первую строку (а): ");
        String a = scanner.nextLine();

        System.out.print("Введите вторую строку (b): ");
        String b = scanner.nextLine();

        System.out.println("---------- РЕЗУЛЬТАТЫ СРАВНЕНИЯ ----------");

        System.out.println(compareStrings(a, b));

        scanner.close();
    }
}
