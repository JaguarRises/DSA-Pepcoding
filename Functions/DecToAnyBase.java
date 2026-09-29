import java.util.Scanner;

public class DecToAnyBase {
    /*
    public static int power10(int n){
        int ans = 1;
        for(int i = 1; i <= n; i++){
            ans *= 10;
        }
        return ans;
    }
    */

    public static int DecToAnyBase(int n, int b){
        int rv = 0;
        int power = 1;
        while(n > 0){
            int rem = n % b;
            n = n / b;
            rv = rv + (rem * power);
            power *= 10;
        }
        return rv;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        int n = scanner.nextInt();

        System.out.print("Enter the base(<=10): ");
        int b = scanner.nextInt();

        int ans = DecToAnyBase(n, b);

        System.out.println(n + " in base " + b + " is: " + ans);

        scanner.close();
    }
}
