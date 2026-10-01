import java.util.Scanner;

public class AnyBaseAddition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base(2<= b <=10): ");
        int b = scanner.nextInt();

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int ans = anyBaseAddition(num1, num2, b);

        System.out.println(num1 + " + " + num2 + " in base " + b + " is: " + ans);

        scanner.close();
    }

    public static int anyBaseAddition(int num1, int num2, int b) {
        int rv = 0;
        int carry = 0;
        int power = 1;
        while(num1 > 0 || num2 > 0 || carry != 0){

            int rem1 = num1 % 10;
            int rem2 = num2 % 10;
            int finalRem = rem1 + rem2 + carry;
            carry = 0;
            if(finalRem >= b){
                carry = finalRem / b;
                finalRem %= b;
            }
            rv += finalRem * power;

            num1 /= 10;
            num2 /= 10;
            power *= 10;
        }

        return rv;
    }
}
