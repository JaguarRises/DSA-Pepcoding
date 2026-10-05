import java.util.Scanner;

public class DiffOfTwoArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements of 1st Array: ");
        int n1 = scanner.nextInt();

        int[] arr1 = new int[n1];

        System.out.println("Enter the " + n1 + " elements: ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.println("Enter the number of elements of 2nd Array (>=n1): ");
        int n2 = scanner.nextInt();

        int[] arr2 = new int[n2];

        System.out.println("Enter the " + n2 + " elements: ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }

        System.out.println("Difference of Two Arrays: ");
        int[] ans = diffOfTwoArrays(arr1, arr2);
        int index = 0;

        while(index < ans.length - 1 && ans[index] == 0){
            index++;
        }

        while(index < ans.length){
            System.out.println(ans[index]);
            index++;
        }

    }

    private static int[] diffOfTwoArrays(int[] arr1, int[] arr2) {

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = arr2.length - 1;

        int[] ans = new int[arr2.length];

        int borrow = 0;

        while(k >= 0){

            int diff = arr2[j] - borrow;

            if(i >= 0){
                diff -= arr1[i];
            }

            if(diff < 0){
                diff += 10;
                borrow = 1;
            }
            else{
                borrow = 0;
            }

            ans[k] = diff;

            i--;
            j--;
            k--;
        }

        return ans;
    }
}
