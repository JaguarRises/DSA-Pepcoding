import java.util.Scanner;

public class DigitsOfANumber {

    public static int countDigits(int num){

        num = Math.abs(num);

        if(num == 0){
            return 1;
        }

        int count = 0;
        while(num > 0){
            count++;
            num = num/10;
        }

        return count;

    }

    public static int multiplier(int count){

        int x = 1;
        for(int i = 1; i < count; i++){
            x *= 10;
        }

        return x;
    }

    public static void printDigits(int num){

        int numberOfDigits = countDigits(num);
        int div = multiplier(numberOfDigits);

        while(num > 0){
            int quotient = num / div;
            System.out.println(quotient);

            num = num % div;
            div = div / 10;
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int num = scanner.nextInt();

        System.out.println("The digits of " + num + " are: ");

        printDigits(num);

        scanner.close();
    }

}
