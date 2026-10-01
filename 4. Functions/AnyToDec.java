import java.util.Scanner;

public class AnyToDec {

    public static int anyBaseToDecimal(int n, int b){
        int rv = 0;
        int powerB = 1;

        while(n > 0){
            int rem = n % 10;
            rv += rem * powerB;
            n = n/10;
            powerB *= b;
        }

        return rv;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();

        System.out.print("Enter the base(<=10): ");
        int b = scanner.nextInt();

        int ans = anyBaseToDecimal(n, b);

        System.out.println(n + " of base " + b + " in Decimal is: " + ans);

    }
}
