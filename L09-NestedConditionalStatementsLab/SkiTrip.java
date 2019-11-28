import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String evaluation = scanner.nextLine();

        int nights = days - 1;
        double nightCost = 0;

        if (roomType.equals("room for one person")) {
            nightCost = 18.00 * nights;
        } else if (roomType.equals("apartment")) {
            if (days < 10) {
                nightCost = 25.00 * nights * 0.70;
            } else if (days <= 15) {
                nightCost = 25.00 * nights * 0.65;
            } else {
                nightCost = 25.00 * nights * 0.50;
            }
        } else {
            if (days < 10) {
                nightCost = 35.00 * nights * 0.90;
            } else if (days <= 15) {
                nightCost = 35.00 * nights * 0.85;
            } else {
                nightCost = 35.00 * nights * 0.80;
            }

        }
        if (evaluation.equals("positive")) {
            nightCost = nightCost * 1.25;
        } else {
            nightCost = nightCost * 0.90;
        }
        System.out.printf("%.2f", nightCost);
    }
}
