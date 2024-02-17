package projects;

import java.io.Console;

public class consoleNotes {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("ENTER YOUR NAME: ");
    String name = console.readLine();
    System.out.println("Hello, " + name);

  }
}
