import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfProjection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        double price = 0.0;

        if ("Premiere".equals(typeOfProjection)) {
            price = 12.0;
        } else if ("Normal".equals(typeOfProjection)) {
            price = 7.50;
        } else if ("Discount".equals(typeOfProjection)) {
            price = 5.00;
        }
        int seats = rows * cols;
        double finalPrice = seats * price;

        System.out.println(String.format("%.2f leva", finalPrice));
    }
}
