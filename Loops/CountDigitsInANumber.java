import java.util.Scanner;

public class CountDigitsInANumber {

    public static int countDigits(int num){

        num = Math.abs(num);

        if(num == 0){
            return 1;
        }

        int count = 0;

        while(num > 0){
            count++;
            num /= 10;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any positive number: ");
        int n = scanner.nextInt();

        int numberOfDigits = countDigits(n);

        System.out.println("Number of digits in " + n + " is : " + numberOfDigits);

        scanner.close();

    }
}
