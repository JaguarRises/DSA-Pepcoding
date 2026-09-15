import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of x: ");
        int x = scanner.nextInt();

        if(x % 2 == 0){
            System.out.println(x + " is Even");
        }
        else
        {
            System.out.println(x + " is Odd");
        }

        System.out.println("Hardwork is better than smart work");

    }
}
