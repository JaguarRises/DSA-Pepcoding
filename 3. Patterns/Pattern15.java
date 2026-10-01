/*

		1
	2	3	2
3	4	5	4	3
	2	3	2
		1

 */

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows(odd): ");
        int n = scanner.nextInt();

        int spaces = n/2;
        int stars = 1;
        int valBegin = 1;
        for(int i = 1; i <= n; i++){
            int valCont = valBegin;
            for(int j = 1; j <= spaces; j++){
                System.out.print("\t");
            }
            for(int k = 1; k <= stars; k++){
                System.out.print(valCont +"\t");
                if(k <= stars/2){
                    valCont++;
                }
                else{
                    valCont--;
                }
            }
            if(i <= n/2){
                spaces--;
                stars+=2;
                valBegin++;
            }
            else{
                spaces++;
                stars-=2;
                valBegin--;
            }
            System.out.println();
        }
        scanner.close();
    }
}