package projects;

import java.util.Scanner;

public class factorialTest {
  public static void main(String[] args) {
    Scanner scaner = new Scanner(System.in);

    System.out.print("ENTER THE NUMBER: ");
    int value = scaner.nextInt();

    System.out.print("ENTER THE FACTORIAL: ");
    int factorial = scaner.nextInt();

    while (value > factorial) {
      factorial *= value;
      // factorial = factorial * value;
      value--;
    }
    System.out.printf("THE FACTORIAL IS: %d%n", factorial);

    scaner.close();
  }
}
