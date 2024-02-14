package projects;

import java.util.Scanner;

public class gradeScore {
  public static void main(String[] args) {

    Scanner gradeScanner = new Scanner(System.in);

    System.out.println("TYPE YOUR SCORES: ");
    double n1 = gradeScanner.nextDouble();
    double n2 = gradeScanner.nextDouble();
    double n3 = gradeScanner.nextDouble();

    double gradeScore = (n1 + n2 + n3) / 3;

    if (gradeScore >= 7) {
      System.out.printf("CONGRATULATIONS, YOU SCORE IS: %.2f", gradeScore);
    } else {
      System.out.println("SORRY, TRY ONE MORE TIME.");
    }

    gradeScanner.close();
  }
}
