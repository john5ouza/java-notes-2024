package fundamentals;

import java.util.Scanner;

public class structureIfElse {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("TYPE YOUR AGE: ");
    int age = scanner.nextInt();

    String menssage = (age >= 18) ? "CONGRATULATIONS, YOU GOT A PASS!" : "GO AWAY.";
    System.out.println(menssage);

    scanner.close();
  }
}
