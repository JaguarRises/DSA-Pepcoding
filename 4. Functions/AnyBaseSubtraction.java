import java.util.Scanner;

public class AnyBaseSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base(2<= b <=10): ");
        int b = scanner.nextInt();

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number (<= num2): ");
        int num2 = scanner.nextInt();

        int ans = anyBaseSubtraction(num1, num2, b);

        System.out.println(num1 + " - " + num2 + " in base " + b + " is: " + ans);

        scanner.close();
    }

    private static int anyBaseSubtraction(int num1, int num2, int b) {

        int rv = 0;
        int borrow = 0;
        int power = 1;

        while(num1 > 0 || num2 > 0 || borrow != 0){
            int rem1 = num1 % 10;
            rem1 -= borrow;
            borrow = 0;
            int rem2 = num2 % 10;
            if(rem1 < rem2){
                borrow = 1;
            }
            int finalRem = (borrow * b + rem1) - rem2;
            rv += finalRem * power;

            num1 /= 10;
            num2 /= 10;
            power *= 10;

        }
        return rv;
    }
}
