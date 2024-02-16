package projects;

import java.io.Console;

public class consoleTest {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("ENTER YOUR NAME: ");
    String name = console.readLine();
    System.out.println("Hello, " + name);

  }
}
