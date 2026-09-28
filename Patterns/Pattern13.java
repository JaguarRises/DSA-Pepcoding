/*
Pascal's Triangle - Binomial Theorem

1
1	1
1	2	1
1	3	3	1
1	4	6	4	1
1	5	10	10	5	1

 */

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++){
            int iCj = 1;
            for(int j = 0; j <= i; j++){
                System.out.print(iCj + "\t");
                int iCjp1 = ((iCj * (i - j)) / (j + 1));        // nCk+1 = (nCk.(n-k))/k+1
                iCj = iCjp1;
            }
            System.out.println();
        }
        scanner.close();
    }
}
