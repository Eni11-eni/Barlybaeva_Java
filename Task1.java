import java.util.Scanner;

public class Task1 {

    public static String compare(int a, int b) {
        if (a > b) {
         return "a > b";
        } else if (a < b) {
            return "a < b";
        } else {
            return "a = b";
        }
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    //В соответствии с типами данных int деление выполняется как целочисленное, дробная часть отбрасывается
    public static String division(int a, int b) {
        if (b == 0) {
            return "Ошибка: деление на ноль невозможно";
        }
        return String.valueOf( a / b);
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое целое число (a): ");
        int a = scanner.nextInt();

        System.out.print("Введите второе целое число (b): ");
        int b = scanner.nextInt();

        System.out.println("---------- РЕЗУЛЬТАТЫ ----------");

        System.out.println(compare(a, b));

        System.out.println(a + " + " + b + " = " + sum(a, b));
        System.out.println(a + " - " + b + " = " + subtract(a, b));
        System.out.println(a + " * " + b + " = " + multiplication(a, b));
        System.out.println(a + " / " + b + " = " + division(a, b));

        scanner.close();
    }
}
