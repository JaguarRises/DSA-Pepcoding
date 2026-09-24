import java.util.Scanner;

public class RotateNumber {

    public static int countDigits(int num) {

        num = Math.abs(num);

        if (num == 0) {
            return 1;
        }

        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10;
        }

        return count;
    }

    public static int powerOf10(int exponent) {

        int ans = 1;

        for (int i = 0; i < exponent; i++) {
            ans *= 10;
        }

        return ans;
    }

    public static int rotateNumber(int n, int k) {

        int digitCount = countDigits(n);

        int remK = Math.abs(k) % digitCount;

        if (remK == 0) {
            return n;
        }

        int ans;

        if (k > 0) {

            // Right rotation

            int div = powerOf10(remK);

            int rem = n % div;

            n = n / div;

            ans = (rem * powerOf10(digitCount - remK)) + n;

        } else {

            // Left rotation

            int div = powerOf10(digitCount - remK);

            int rem = n % div;

            n = n / div;

            ans = (rem * powerOf10(remK)) + n;
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int n = scanner.nextInt();

        System.out.print("Enter the number of rotations (+/-): ");
        int k = scanner.nextInt();

        int ans = rotateNumber(n, k);

        if (k == 0) {
            System.out.println(
                    "The number " + n +
                            " after " + k +
                            " rotations becomes: " + ans
            );
        } else if (k > 0) {
            System.out.println(
                    "The number " + n +
                            " after " + k +
                            " positive (right) rotations becomes: " + ans
            );
        } else {
            System.out.println(
                    "The number " + n +
                            " after " + Math.abs(k) +
                            " negative (left) rotations becomes: " + ans
            );
        }

        scanner.close();
    }
}

/*
Optimised Solution
public static int rotateNumber(int num, int k) {

        int digitCount = countDigits(num);

        // Normalize k to [0, digitCount - 1]
        k = ((k % digitCount) + digitCount) % digitCount;

        if (k == 0) {
            return num;
        }

        int divisor = powerOf10(k);

        int remainder = num % divisor;

        num = num / divisor;

        return remainder * powerOf10(digitCount - k) + num;
    }
*/