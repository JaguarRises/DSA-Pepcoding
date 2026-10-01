import java.util.Scanner;

public class TakingInput {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        // When you have to take string input and integer in the same program.
        int num = Integer.parseInt(scanner.nextLine());
        String name = scanner.nextLine();

        System.out.println("Dear " + name + ". Here is the counting: ");
        for (int index = 1; index <= num; index++) {

            System.out.println(index);
            
        }

    }
}
