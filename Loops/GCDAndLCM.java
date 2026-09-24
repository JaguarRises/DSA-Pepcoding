import java.util.Scanner;

public class GCDAndLCM {

    public static int calculateGCD(int num1, int num2){

        int dividend = Math.abs(num1);
        int divisor = Math.abs(num2);
        int rem = dividend % divisor;
        while(rem != 0){
            dividend = divisor;
            divisor = rem;
            rem = dividend % divisor;
        }

        return divisor;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the two numbers: (>0)");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int gcd = calculateGCD(num1, num2);
        int lcm = (num1 * num2)/gcd;

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}
