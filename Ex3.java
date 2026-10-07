import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть початкове значення: ");
        int start = scanner.nextInt();

        System.out.print("Введіть кінцеве значення: ");
        int end = scanner.nextInt();

        System.out.print("Введіть просте число від 1 до 9: ");
        int number = scanner.nextInt();

        System.out.println("Результат:");

        for (int i = start; i <= end; i++) {
            if (i % number == 0) {
                continue;
            }

            System.out.println(i);
        }
    }
}
