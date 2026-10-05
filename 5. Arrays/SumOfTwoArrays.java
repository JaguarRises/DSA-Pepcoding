import java.util.Scanner;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements of 1st Array: ");
        int n1 = scanner.nextInt();

        int[] arr1 = new int[n1];

        System.out.println("Enter the " + n1 + " elements: ");
        for(int i = 0; i < n1; i++){
            arr1[i] = scanner.nextInt();
        }

        System.out.println("Enter the number of elements of 2nd Array: ");
        int n2 = scanner.nextInt();

        int[] arr2 = new int[n2];

        System.out.println("Enter the " + n2 + " elements: ");
        for(int i = 0; i < n2; i++){
            arr2[i] = scanner.nextInt();
        }

        System.out.println("Sum of the two arrays is: ");

        int[] ans = sumOfTwoArrays(arr1, arr2);
        for(int i = 0; i < ans.length; i++){
            System.out.println(ans[i]);
        }
    }

    private static int[] sumOfTwoArrays(int[] arr1, int[] arr2) {

        int n1 = arr1.length;
        int n2 = arr2.length;

        int size = Math.max(n1, n2);

        int[] ans = new int[size + 1];

        int i = n1 - 1;
        int j = n2 - 1;
        int k = ans.length - 1;

        int carry = 0;

        while(i >= 0 || j >= 0 || carry != 0) {

            int sum = carry;

            if(i >= 0){
                sum += arr1[i];
            }

            if(j >= 0){
                sum += arr2[j];
            }

            ans[k] = sum % 10;
            carry = sum / 10;

            i--;
            j--;
            k--;
        }

        return ans;
    }
}
