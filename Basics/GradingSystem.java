import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int marks;

        System.out.println("Enter the marks of the student: ");

        marks = scanner.nextInt();

        if(marks > 90){
            System.out.println("Excellent");
        }
        else if(marks > 90){
            System.out.println("Good");
        }
        else if(marks > 70){
            System.out.println("Fair");
        }
        else if(marks > 60){
            System.out.println("Meets Expectations");
        }
        else{
            System.out.println("Below Par");
        }

        scanner.close();
    }
}
