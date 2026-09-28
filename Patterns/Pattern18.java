/*

*   *   *   *   *   *   *
    *               *
        *       *
            *
        *   *   *
    *   *   *   *   *
*   *   *   *   *   *   *

 */

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows (odd): ");
        int n = scanner.nextInt();

        int outerSpaces = 0;
        int stars = n;
        for(int i = 1; i <= n; i++){
            for(int k = 1; k <= outerSpaces; k++){
                System.out.print("\t");
            }
            for(int j = 1; j <= stars; j++){
                if (i > 1 && i <= n / 2 && j > 1 && j < stars) {
                    System.out.print("\t");
                } else {
                    System.out.print("*\t");
                }
            }
            if(i <= n/2){
                outerSpaces++;
                stars -= 2;
            }
            else{
                outerSpaces--;
                stars += 2;
            }
            System.out.println();
        }
        scanner.close();
    }
}