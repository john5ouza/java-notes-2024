package projects;

import java.util.Scanner;

public class calculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("TYPE: NUMBER 1 AND NUMBER 2");
    int value01 = sc.nextInt();
    int value02 = sc.nextInt();

    System.out.println("ENTER THE OPERATOR (+, -, *, /)");
    String operator = sc.next();

    switch (operator) {
      case "+" -> System.out.println("RESULT: \n" + (value01 + value02));
      case "-" -> System.out.println("RESULT: \n" + (value01 - value02));
      case "*" -> System.out.println("RESULT: \n" + (value01 * value02));
      case "/" -> System.out.println("RESULT: \n" + (value01 / value02));
      default -> System.out.println("INVALID OPERATOR.");
    }

    sc.close();
  }
}
