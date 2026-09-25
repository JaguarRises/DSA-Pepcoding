/*

0 0 1 0 0
0 1 1 1 0
1 1 1 1 1
0 1 1 1 0
0 0 1 0 0

 */

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows (odd): ");
        int n = scanner.nextInt();

        int space = n/2;
        int star = 1;
       for(int i = 1; i <= n; i++){

           for(int j = 1; j <= space; j++){
               System.out.print("0 ");
           }
           for(int k = 1; k <= star; k++){
               System.out.print("1 ");
           }
           for(int j = 1; j <= space; j++){
               System.out.print("0 ");
           }

           if(i <= n/2){
               space--;
               star+=2;
           }
           else{
               space++;
               star-=2;
           }
           System.out.println();
       }
    }
}
