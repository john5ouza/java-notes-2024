package projects;

import java.util.Scanner;

public class timesTable {
  public static void main(String[] args) {

    Scanner timesTableScanner = new Scanner(System.in);
    System.out.print("ENTER THE NUMBER: ");
    int number = timesTableScanner.nextInt();

    System.out.println(number + " * 1 = " + (1 * number));
    System.out.println(number + " * 2 = " + (2 * number));
    System.out.println(number + " * 3 = " + (3 * number));
    System.out.println(number + " * 4 = " + (4 * number));
    System.out.println(number + " * 5 = " + (5 * number));
    System.out.println(number + " * 6 = " + (6 * number));
    System.out.println(number + " * 7 = " + (7 * number));
    System.out.println(number + " * 8 = " + (8 * number));
    System.out.println(number + " * 9 = " + (9 * number));
    System.out.println(number + " * 10 = " + (10 * number));

    timesTableScanner.close();

  }
}
