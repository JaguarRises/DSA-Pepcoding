import java.util.Scanner;

public class InverseOfANumber {

    public static int inverseNumber(int num){

        int index = 0;
        int inversedNumber = 0;
        while(num > 0){
            index++;
            int rem = num % 10;
            inversedNumber = (int) (inversedNumber + (index * Math.pow(10, rem - 1)));
            num = num / 10;
        }

        return inversedNumber;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = scanner.nextInt();

        int ans = inverseNumber(n);
        System.out.println("Inverse of " + n + " is: " + ans);

        scanner.close();
    }
}
