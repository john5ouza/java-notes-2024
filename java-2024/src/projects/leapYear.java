package projects;

import java.util.Scanner;

public class leapYear {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("ENTER THE YEAR: ");
    int yearValue = sc.nextInt();

    if (yearValue % 4 == 0 || (yearValue % 100 != 0 && yearValue % 400 == 0))
      System.out.printf("%d IS A LEAP YEAR.", yearValue);
    else
      System.out.printf("%d IS NOT A LEAP YEAR.", yearValue);

    // Um ano bissexto precisa ser divisível por 4, mas existem
    // exceções. A regra básica é que um ano é bissexto se for divisível por 4. No
    // entanto, existem algumas exceções a essa regra:

    // Anos que são divisíveis por 100 não são bissextos, a menos que também sejam
    // divisíveis por 400. Isso significa que os anos divisíveis por 100, mas não
    // por 400, não são bissextos. Por exemplo, o ano 1900 foi divisível por 100,
    // mas não foi bissexto porque não foi divisível por 400. No entanto, o ano 2000
    // foi bissexto porque foi divisível por 400.

    // Os anos que são divisíveis por 4, mas não por 100, são bissextos. Por
    // exemplo, os anos 1996, 2004, 2008 são bissextos porque são divisíveis por 4,
    // mas não por 100.

    // Portanto, a condição para verificar se um ano é bissexto precisa levar em
    // consideração essas exceções. A expressão yearValue % 4 == 0 && (yearValue %
    // 100 != 0 || yearValue % 400 == 0) encapsula essas regras, verificando se o
    // ano é divisível por 4, mas não por 100, ou se é divisível por 400.

    sc.close();
  }
}
