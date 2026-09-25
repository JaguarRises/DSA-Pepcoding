/*

0 0 0 0 1
0 0 0 1 1
0 0 1 1 1
0 1 1 1 1
1 1 1 1 1

 */

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= n - i; j++){
                System.out.print("0 ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("1 ");
            }
            System.out.println();
        }


        System.out.println();
        // Alternate solution - Easier to maintain count
        int space = n-1;
        int star = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= space; j++){
                System.out.print("0 ");
            }
            for(int k = 1; k <= star; k++){
                System.out.print("1 ");
            }
            space--;
            star++;
            System.out.println();
        }
    }
}

