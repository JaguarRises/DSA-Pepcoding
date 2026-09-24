import java.util.Scanner;

public class PrimeFactorization {

    /*public static boolean isPrime(int num) {

        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return false;
        }

        return true;
    }

    public static void primeFactorization(int n){
        for(int i = 2; i <= n; i++){
            if(isPrime(i)){
                while(n % i == 0){
                    System.out.print(i + " ");
                    n = n / i;
                }
            }
        }
    }
*/

    public static void primeFactorization(int n){
        for(int i = 2; i * i <= n; i++){
            while(n % i == 0){
                System.out.print(i + " ");
                n = n / i;
            }
        }
        if(n > 1) {
            System.out.print(n); // Remaining prime factor
        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number you want to do prime factorization(>1): ");
        int n = scanner.nextInt();

        System.out.println("Prime Factorization of " + n + " is: ");
        primeFactorization(n);

    }
}
