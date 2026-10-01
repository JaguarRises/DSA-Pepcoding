import java.util.Scanner;

public class AnyToAny {

    public static int anyBaseToDecimal(int n, int b){
        int rv = 0;
        int power = 1;
        while(n > 0){
            int rem = n % 10;
            rv += rem * power;
            n = n / 10;
            power *= b;
        }

        return rv;
    }

    public static int decimalToAnyBase(int n, int b){
        int rv = 0;
        int power10 = 1;

        while(n > 0){
            int rem = n % b;
            rv += rem * power10;
            n = n / b;
            power10 *= 10;
        }

        return rv;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();

        System.out.print("Enter the first base(<=10): ");
        int b1 = scanner.nextInt();

        System.out.print("Enter the second base(<=10): ");
        int b2 = scanner.nextInt();

        int ans1 = anyBaseToDecimal(n, b1);
        //System.out.println(ans1);
        int finalAns = decimalToAnyBase(ans1, b2);

        System.out.println(n + " of base " + b1 + " in base " + b2 + " is: " + finalAns);
    }
}
