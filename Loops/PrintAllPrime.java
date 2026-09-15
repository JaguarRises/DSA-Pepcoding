import java.util.Scanner;

public class PrintAllPrime {

    public static boolean isPrime(int num) {

        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return false;
        }

        return true;
    }

    public static void allPrime(int low, int high) {

        for (int i = low; i <= high; i++) {

            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter lower bound: ");
        int low = scanner.nextInt();

        System.out.print("Enter upper bound: ");
        int high = scanner.nextInt();

        if (low > high) {
            System.out.println("Incorrect Range");
        } else {
            allPrime(low, high);
        }

        scanner.close();
    }
}