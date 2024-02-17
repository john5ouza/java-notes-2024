package projects;

import java.util.Scanner;

public class celsiusToFahrenheit {
  public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // char answer = 'Y';

    // while (answer != 'N') {

    // System.out.print("ENTER TEMPERATURE IN CELSIUS: ");
    // double celsius = sc.nextDouble();
    // double fahrenheit = 9.0 * celsius / 5.0 + 32.0;
    // System.out.printf("EQUIVALENTE EM FAHRENHEIT: %.1f%n", fahrenheit);

    // System.out.println("WOULD YOU LIKE TO REPEAT (Y/N)?");
    // answer = sc.next().charAt(0);

    // }
    // sc.close();

    // #------------------------------------------------------------

    Scanner sc = new Scanner(System.in);

    char answer;

    do {
      System.out.print("ENTER TEMPERATURE IN CELSIUS: ");
      double celsius = sc.nextDouble();
      double fahrenheit = 9.0 * celsius / 5.0 + 32.0;
      System.out.printf("EQUIVALENTE EM FAHRENHEIT: %.1f%n", fahrenheit);

      System.out.println("WOULD YOU LIKE TO REPEAT (Y/N)?");
      answer = sc.next().charAt(0);
    } while (answer != 'N');

    sc.close();
  }
}
