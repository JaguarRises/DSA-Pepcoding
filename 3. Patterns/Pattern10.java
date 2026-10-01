/*

0 0 1 0 0
0 1 0 1 0
1 0 0 0 1
0 1 0 1 0
0 0 1 0 0

 */

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows(odd): ");
        int n = scanner.nextInt();

        int outerSpace = n/2;
        int innerSpace = -1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= outerSpace; j++){
                System.out.print("0 ");
            }
            System.out.print("1 ");

            for(int k = 1; k <= innerSpace; k ++){
                System.out.print("0 ");
            }
            if(i != 1 && i != n){
                System.out.print("1 ");
            }
            for(int j = 1; j <= outerSpace; j++){
                System.out.print("0 ");
            }
            if(i <= n/2){
                outerSpace--;
                innerSpace+=2;
            }
            else{
                outerSpace++;
                innerSpace-=2;
            }
            System.out.println();
        }
    }
}
