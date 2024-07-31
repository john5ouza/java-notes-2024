package fundamentals;

import java.io.Console;

public class structureSwitch {

  public static void main(String[] args) {

    Console console = System.console();

    System.out.println("ENTER YOUR GRADE (A,B,C,D,E): ");
    String grade = console.readLine();

    String mensage = switch (grade) {
      case "A" -> "EXCELENT!";
      case "B" -> "GOOD JOB!";
      case "C" -> "CONGRATULATIONS!";
      case "D" -> "YOUT MUST BE BETTER!";
      case "E" -> "YOU FAIL.";
      default -> "INVALID OPTION.";
    };
    System.out.println(mensage);

  }
}