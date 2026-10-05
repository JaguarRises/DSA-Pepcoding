import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the " + n + " elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("BAR CHART");
        barChart(arr);
    }

    private static int maxElement(int[] arr){
        int max = arr[0];
        for(int i = 1; i <arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    private static void barChart(int[] arr){
        int max = maxElement(arr);
        for(int i = 0; i < max; i++){
            for(int j = 0; j < arr.length; j++){
                if(i >= (max - arr[j])){
                    System.out.print("x\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
