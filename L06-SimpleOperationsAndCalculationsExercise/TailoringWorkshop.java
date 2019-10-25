import java.util.Scanner;

public class TailoringWorkshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tables = Integer.parseInt(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double areaOneCover = (length + 2 * 0.30) * (width +2 * 0.30);
        double areaOneSquare = (length / 2) * (length / 2);
        double areaCovers = tables * areaOneCover;
        double areaSquares = tables * areaOneSquare;
        double priceCovers = areaCovers * 7;
        double priceSquares = areaSquares * 9;
        double totalPriceInDollars = priceCovers + priceSquares;
        double totalPriceInBGN = totalPriceInDollars * 1.85;
        System.out.printf("%.2f USD%n", totalPriceInDollars);
        System.out.printf("%.2f BGN", totalPriceInBGN);
    }

}
