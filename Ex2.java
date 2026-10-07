import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ціле число: ");
        int number = scanner.nextInt();

        int temp = number;
        int reverse = 0;

        while (temp > 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }

        System.out.printf("Результат (while): %010d%n", reverse);


        temp = number;
        reverse = 0;

        do {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        } while (temp > 0);

        System.out.printf("Результат (do-while): %010d%n", reverse);

        scanner.close();
    }
}
