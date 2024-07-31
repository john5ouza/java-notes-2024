package projects;

import java.util.Scanner;

public class athleteClass {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("WRITE YOUR AGE AND FIND OUT YOUR CATEGORY");
    int age = sc.nextInt();

    if (age >= 10 && age <= 12)
      System.out.println("CLASS: MIRIM.");
    else if (age >= 13 && age <= 15)
      System.out.println("CLASS: CHILDREN.");
    else if (age >= 16 && age <= 18)
      System.out.println("CLASS: YOUTH.");
    else
      System.out.println("INVALID AGE!");

    sc.close();

  }
}
