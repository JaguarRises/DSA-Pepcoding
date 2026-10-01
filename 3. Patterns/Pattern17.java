/*
        *
        *   *
*   *   *   *   *
        *   *
        *
 */

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows(odd): ");
        int n = scanner.nextInt();

        int spaces = n/2;
        int stars = 1;
        for(int i = 1; i <= n; i++){
            if(i != n/2 + 1){
                for(int j = 1; j <= spaces; j++){
                    System.out.print("\t");
                }
            }
            else{
                for(int j = 1; j <= n/2; j++){
                    System.out.print("*\t");
                }
            }
            for(int k = 1; k <= stars; k++){
                System.out.print("*\t");
            }
            if(i <= n/2){
                stars++;
            }
            else{
                stars--;
            }
            System.out.println();
        }
        scanner.close();
    }
}