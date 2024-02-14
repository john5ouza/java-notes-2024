package fundamentals;

import java.util.Scanner;

public class stringNotes {
  public static void main(String[] args) {
    Scanner nameScanner = new Scanner(System.in);

    System.out.println("ENTER YOU NAME: ");
    String nameUser = nameScanner.nextLine();
    System.out.println("HELLO, YOU'RE WELCOME " + nameUser);

    nameScanner.close();
  }
}
