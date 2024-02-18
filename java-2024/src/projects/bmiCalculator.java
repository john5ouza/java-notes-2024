package projects;

import java.util.Scanner;

public class bmiCalculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("WELCOME TO THE BMI CALCULATOR!");

    System.out.println("ENTER THE HEIGHT:");
    double heightValue = sc.nextDouble();

    System.out.println("ENTER THE WEIGHT:");
    int weightValue = sc.nextInt();

    final double bmi = weightValue / (heightValue * heightValue);

    if (bmi >= 18.5)
      System.out.println("THINNESS");
    else if (bmi >= 18.5 && bmi <= 24.9)
      System.out.println("NORMAL");
    else if (bmi >= 25 && bmi <= 29.9)
      System.out.println("OVERWEIGHT");
    else if (bmi >= 30 && bmi <= 39.9)
      System.out.println("OBESITY");
    else if (bmi > 40)
      System.out.println("SEVERE OBESITY");

    System.out.printf("YOU BMI IS: %.1f%n.", bmi);

    sc.close();
  }
}
