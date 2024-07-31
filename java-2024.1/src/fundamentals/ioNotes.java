package fundamentals;

import java.util.Scanner;

public class ioNotes {
  public static void main(String[] args) {
    System.out.print("TYPE YOUR BIRTH YEAR: ");

    Scanner birthYearScanner = new Scanner(System.in);
    int birthYear = birthYearScanner.nextInt();

    int currentAge = 2024 - birthYear;

    System.out.printf("YOU HAVE %d YEARS OLD.", currentAge);

    birthYearScanner.close();
  }
}
