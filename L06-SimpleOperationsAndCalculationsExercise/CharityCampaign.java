import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int bakers = Integer.parseInt(scanner.nextLine());
        int cakes = Integer.parseInt(scanner.nextLine());
        int waffles = Integer.parseInt(scanner.nextLine());
        int pancakes = Integer.parseInt(scanner.nextLine());
        double cakesProfit = cakes * 45;
        double wafflesProfit = waffles * 5.80 ;
        double pancakesProfit = pancakes * 3.20;
        double bakersProfit = (cakesProfit + wafflesProfit + pancakesProfit) * bakers;
        double fullProfit = days * bakersProfit;
        double netProfit = fullProfit - (fullProfit / 8);
        System.out.printf("%.2f", netProfit);
    }

}
