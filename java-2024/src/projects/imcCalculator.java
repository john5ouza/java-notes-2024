package projects;

import java.util.Scanner;

public class imcCalculator {
  public static void main(String[] args) {
    Scanner entry = new Scanner(System.in);

    System.out.print("NAME: ");
    String name = entry.nextLine();

    System.out.print("WEIGHT: ");
    int weight = entry.nextInt();

    System.out.print("HEIGHT: ");
    double height = entry.nextDouble();

    double imc = weight / (height * height);

    System.out.printf("THE IMC OF %s: %.2f%n", name, imc);

    entry.close();
  }
}
