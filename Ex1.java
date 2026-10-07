import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите два целых числа:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        System.out.println("Наибольший общий делитель = " + a);

        scanner.close();
    }
}