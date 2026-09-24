import java.util.Scanner;

public class ReverseOfANumber {

    public static void digitsOfReversedNumber(int num){

        while(num > 0 ){
            int rem = num % 10;
            System.out.println(rem);

            num = num / 10;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number: ");

        int x = scanner.nextInt();

        System.out.println("Reverse Digits of the number are: ");
        digitsOfReversedNumber(x);

        scanner.close();
    }
}
