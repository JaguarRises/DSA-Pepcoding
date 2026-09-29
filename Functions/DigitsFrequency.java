import java.util.Scanner;

public class DigitsFrequency {

    public static int digitFreq(int n, int d){
        int count = 0;

        while(n > 0){
            int rem = n % 10;
            if(rem == d){
                count++;
            }
            n = n/10;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        System.out.print("Enter the digit: ");
        int d = scanner.nextInt();

        int freq = digitFreq(n, d);

        System.out.println("Digit " + d + " appears " + freq + " times in " + n);
    }
}

