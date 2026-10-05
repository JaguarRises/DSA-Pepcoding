import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the " + n + " elements of the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the element to search: ");
        int x = scanner.nextInt();

        int index = linearSearch(arr, x);

        if(index == -1){
            System.out.println("Not Found!!");
        }
        else{
            System.out.println("Element " + x + " found first at index: " + index);
        }

        scanner.close();

    }

    private static int linearSearch(int[] arr, int x) {
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
}
