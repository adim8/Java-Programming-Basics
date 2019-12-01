import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowers = scanner.nextLine();
        int flowerCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double price = 0.0;
        double difference = 0.0;

        double roses = 5.0;
        double dahlias = 3.8;
        double tulips = 2.8;
        double narcissus = 3.0;
        double gladiolus = 2.5;

        switch (flowers) {
            case "Roses":
                price = flowerCount * roses;
                break;

            case "Dahlias":
                price = flowerCount * dahlias;
                break;

            case "Tulips":
                price = flowerCount * tulips;
                break;

            case "Narcissus":
                price = flowerCount * narcissus;
                break;

            case "Gladiolus":
                price = flowerCount * gladiolus;
                break;
        }

        if (flowerCount > 80 && flowers.equals("Roses")) {
            price -= price * 0.1;
        }
        else if (flowerCount > 90 && flowers.equals("Dahlias")) {
            price -= price * 0.15;
        }
        else if (flowerCount > 80 && flowers.equals("Tulips")) {
            price -= price * 0.15;
        }
        else if (flowerCount < 120 && flowers.equals("Narcissus")) {
            price += price * 0.15;
        }
        else if (flowerCount < 80 && flowers.equals("Gladiolus")) {
            price += price * 0.2;
        }
        if (budget >= price) {
            difference = budget - price;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowers, difference);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", price - budget);
        }
    }
}