import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double value = Double.parseDouble(scanner.nextLine());
            String input = scanner.nextLine();
            String output = scanner.nextLine();

           // double m = 1.0;
           // double mm = 1000;
           // double cm = 100;

            switch (input) {
                case "mm":
                    value = value / 1000;
                    break;
                case "cm":
                    value = value / 100;
                    break;
                case "m":
                    break;
            }
            switch (output) {
                case "mm":
                    value = value * 1000;
                    break;
                case "cm":
                    value = value * 100;
                    break;
                case "m":
                    break;
            }
        System.out.printf("%.3f", value);
        }
    }