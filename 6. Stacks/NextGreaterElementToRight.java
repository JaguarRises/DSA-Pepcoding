import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElementToRight {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] ans = ngetr(arr);

        System.out.println("Next Greater Element to Right:");

        for (int i = 0; i < ans.length; i++) {
            System.out.println("NGETR of " + arr[i] + " is: " + ans[i]);
        }

        scanner.close();
    }

    private static int[] ngetr(int[] arr) {

        // R to L

        int[] ans = new int[arr.length];

        Stack<Integer> st = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {

            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }

            st.push(arr[i]);
        }

        return ans;
    }

    // L to R

    private static int[] ngetrApproach2(int[] arr) {

        int[] ans = new int[arr.length];

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            while (!st.isEmpty() && arr[i] >= arr[st.peek()]) {
                int pos = st.peek();
                ans[pos] = arr[i];
                st.pop();
            }

            st.push(i);
        }

        while (!st.isEmpty()) {
            int pos = st.peek();
            ans[pos] = -1;
            st.pop();
        }

        return ans;
    }
}