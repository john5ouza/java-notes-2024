package projects;

import java.util.Scanner;

public class guessNumber {
  public static void main(String[] args) {
    int number = 7;
    int attempts = 5;

    Scanner sc = new Scanner(System.in);

    while (attempts > 0) {
      System.out.println("TYPE A NUMBER BETWEEN 1 AND 10");
      int guessNumber = sc.nextInt();

      if (guessNumber == number) {
        System.out.println("CONGRATULATIONS, YOU GET THE NUMBER RIGHT! (:");
        return;
      } else {
        attempts--;
      }
    }

    System.out.println("HEY, ATTEMPT LIMIT EXCEEDED.");

    sc.close();

  }
}
