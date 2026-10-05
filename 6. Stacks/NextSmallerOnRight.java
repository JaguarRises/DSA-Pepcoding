import java.util.Scanner;
import java.util.Stack;

public class NextSmallerOnRight {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] ans = nsetr(arr);

        System.out.println("Next Smaller Element to Right:");

        for (int i = 0; i < ans.length; i++) {
            System.out.println("NSETR of " + arr[i] + " is: " + ans[i]);
        }

        scanner.close();
    }

    private static int[] nsetr(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];
        for(int i = arr.length - 1; i >= 0; i--){
            while(!st.isEmpty() && st.peek() >= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = -1;
            }
            else{
                ans[i] = st.peek();
            }
            st.push(arr[i]);
        }

        return ans;
    }
}
