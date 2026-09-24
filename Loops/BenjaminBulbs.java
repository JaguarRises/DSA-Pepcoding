import java.util.Scanner;

public class BenjaminBulbs {

    public static void benjaminBulbs(int n){

        for(int i = 1; i*i <= n ; i++){
            System.out.print(i*i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of bulbs: ");
        int n = scanner.nextInt();

        System.out.println("The bulb numbers after " + n + " voltage fluctuations that will remain on are: ");
        benjaminBulbs(n);
    }
}
