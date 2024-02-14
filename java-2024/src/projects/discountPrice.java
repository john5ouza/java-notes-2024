package projects;

import java.util.Scanner;

public class discountPrice {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("ENTER THE PRICE: ");
    double price = scanner.nextDouble();

    System.out.print("ENTER THE DISCOUNT: ");
    double discount = scanner.nextDouble();

    double priceDiscount = (discount * price) / 100;
    double newPrice = price - priceDiscount;

    System.out.printf("THE VALUE WITH DISCOUNT IS R$%.2f AND YOU SAVED R$%.2f.\n", newPrice, priceDiscount);

    scanner.close();

  }
}
