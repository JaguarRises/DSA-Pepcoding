import java.util.Scanner;

public class IntroToFn {
    // DRY - Don't Repeat Yourself

    public static int factN(int n){
        int fact = 1;
        for(int i = 2; i <= n; i++){
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        System.out.print("Enter r: ");
        int r = scanner.nextInt();

        int nFact = factN(n);
        int nmrFact = factN(n-r);
        int nPr = nFact / nmrFact;

        System.out.println(n + "P" + r + " = " + nPr);

    }
}
