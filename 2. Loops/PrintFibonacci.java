import java.util.Scanner;

public class PrintFibonacci {

    public static void printFibo(int n) {

        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }

        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {

            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");

        int n = scanner.nextInt();

        System.out.println("First " + n + " Fibonacci numbers:");

        printFibo(n);

        scanner.close();
    }
}