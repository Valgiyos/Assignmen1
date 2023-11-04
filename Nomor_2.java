import java.util.Scanner;

public class WhileLoopExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        while (number < 5) {
            System.out.print("Masukkan sebuah angka (0-4): ");
            number = scanner.nextInt();

            if (number < 0 || number > 4) {
                System.out.println("Angka tidak valid, silakan coba lagi.");
            } else if (number % 2 == 0) {
                System.out.println("Angka genap.");
            } else {
                System.out.println("Angka ganjil.");
            }
        }

        scanner.close();
    }
}
