import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        boolean isWorkingDay = day.equals("Monday") || day.equals("Tuesday")
                || day.equals("Wednesday") || day.equals("Thursday")
                || day.equals("Friday");

        boolean isWeekend = day.equals("Saturday") || day.equals("Sunday");

        double price = 0;

        if(isWorkingDay){
            switch (fruit){
                case "banana":
                    price = 2.50;
                    break;
                case "apple":
                    price = 1.20;
                    break;
                case "orange":
                    price = 0.85;
                    break;
                case "grapefruit":
                    price = 1.45;
                    break;
                case "kiwi":
                    price = 2.70;
                    break;
                case "pineapple":
                    price = 5.50;
                    break;
                case "grapes":
                    price = 3.85;
                    break;
            }
        }else if(isWeekend){
            switch (fruit){
                case "banana":
                    price = 2.70;
                    break;
                case "apple":
                    price = 1.25;
                    break;
                case "orange":
                    price = 0.90;
                    break;
                case "grapefruit":
                    price = 1.60;
                    break;
                case "kiwi":
                    price = 3.00;
                    break;
                case "pineapple":
                    price = 5.60;
                    break;
                case "grapes":
                    price = 4.20;
                    break;
            }
        }
        if(price != 0){
            System.out.println(String.format("%.2f", quantity * price));
        }else{
            System.out.println("error");
        }
    }
}
