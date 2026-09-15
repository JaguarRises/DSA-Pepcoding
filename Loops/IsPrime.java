import java.util.*;

class IsPrime {

  public static boolean isPrime(int num) {

    if(num < 2) return false;
    if (num == 2) return true;
    if (num % 2 == 0) return false; //Even

    for(int i = 3; i * i <= num; i += 2){
      if(num % i == 0) return false;
    }

    return true;
  }

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter any number to check Prime: ");

    int num = scanner.nextInt();

    if (isPrime(num)) {
      System.out.println("Prime!");
    } else {
      System.out.println("Not Prime!");
    }

    scanner.close();
  }
}