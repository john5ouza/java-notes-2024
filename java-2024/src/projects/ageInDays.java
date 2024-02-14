package projects;

import java.util.Scanner;

public class ageInDays {
  public static void main(String[] args) {
    System.out.println("ENTER YOUR AGE: ");
    Scanner ageScanner = new Scanner(System.in);
    int currentAge = ageScanner.nextInt();
    int ageDays = currentAge * 365;

    System.out.printf("YOU HAVE %d AGE DAYS.\n", ageDays);

    ageScanner.close();
  }
}
