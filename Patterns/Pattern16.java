/*

1	0	0	0	0	0	1
1	2	0	0	0	2	1
1	2	3	0	3	2	1
1	2	3	4	3	2	1

 */

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        int spaces = 2*n -3;
        int star = 1;
        for(int i = 1; i <= n; i++){
            int val = 1;
            for(int j = 1; j <= star; j++){
                System.out.print(val + "\t");
                val++;
            }
            for(int k = 1; k <= spaces; k++){
                System.out.print("\t");
            }
            int cval = val-1;
            if(i == n){
                star--;
                cval--;
            }
            for(int p = 1; p <= star; p++){
                System.out.print(cval + "\t");
                cval--;
            }
            System.out.println();
            spaces-=2;
            star++;
        }
        scanner.close();
    }
}