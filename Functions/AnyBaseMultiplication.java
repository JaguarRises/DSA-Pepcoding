import java.util.Scanner;

public class AnyBaseMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base(2<= b <=10): ");
        int b = scanner.nextInt();

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int ans = anyBaseMultiplication(num1, num2, b);

        System.out.println(num1 + " x " + num2 + " in base " + b + " is: " + ans);

        scanner.close();
    }

    private static int anyBaseMultiplication(int num1, int num2, int b) {

        int rv = 0;
        int power = 1;

        while (num2 > 0) {

            int rem2 = num2 % 10;

            int partial = multiplyByDigit(num1, rem2, b);

            // Reuse anyBaseAddition from AnyBaseAddition.java
            rv = AnyBaseAddition.anyBaseAddition(rv, partial * power, b);

            num2 /= 10;
            power *= 10;
        }

        return rv;
    }

    private static int multiplyByDigit(int num1, int digit, int b) {

        int rv = 0;
        int carry = 0;
        int power = 1;

        while (num1 > 0 || carry != 0) {

            int rem1 = num1 % 10;

            int product = rem1 * digit + carry;

            int finalRem = product % b;
            carry = product / b;

            rv += finalRem * power;

            num1 /= 10;
            power *= 10;
        }

        return rv;
    }
}
