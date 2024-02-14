package projects;

import java.util.Scanner;

public class dolarToReal {
  public static void main(String[] args) {
    Scanner scaner = new Scanner(System.in);

    System.out.print("ENTER THE VALUE IN DOLLAR: ");
    double dollar = scaner.nextDouble();

    System.out.print("ENTER THE DOLLAR QUOTE: ");
    double dollarQuote = scaner.nextDouble();

    double realValue = dollar * dollarQuote;

    System.out.printf("THE VALUE IN BRASILIAN REAL IS: R$%.2f", realValue);

    scaner.close();
  }
}