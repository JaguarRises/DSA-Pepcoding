/*

1 1 1 0 1 1 1
1 1 0 0 0 1 1
1 0 0 0 0 0 1
1 1 0 0 0 1 1
1 1 1 0 1 1 1

 */

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        int stars = n/2 + 1;
        int spaces = 1;
        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= stars; j++){
                System.out.print("1 ");
            }

            for(int k = 1; k <= spaces; k++){
                System.out.print("0 ");
            }

            for(int j = 1; j <= stars; j++){
                System.out.print("1 ");
            }

            if(i <= n/2){
                stars--;
                spaces+=2;
            }
            else{
                stars++;
                spaces-=2;
            }
            System.out.println();

        }
    }
}
