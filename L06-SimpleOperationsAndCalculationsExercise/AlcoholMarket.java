import java.util.Scanner;

public class AlcoholMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceWhiskey = Double.parseDouble(scanner.nextLine());
        double beerAmount = Double.parseDouble(scanner.nextLine());
        double wineAmount = Double.parseDouble(scanner.nextLine());
        double rakiyaAmount = Double.parseDouble(scanner.nextLine());
        double whiskeyAmount = Double.parseDouble(scanner.nextLine());
        double priceRakiya = priceWhiskey * 0.5;
        double priceWine = priceRakiya * 0.6;
        double priceBeer = priceRakiya * 0.2;
        double whiskey = priceWhiskey * whiskeyAmount;
        double beer = priceBeer * beerAmount;
        double wine = priceWine * wineAmount;
        double rakiya = priceRakiya * rakiyaAmount;
        double price = whiskey + beer + wine + rakiya;
        System.out.printf("%.2f", price);
    }

}
