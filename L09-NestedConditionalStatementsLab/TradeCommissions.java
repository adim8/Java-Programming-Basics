import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double commision = -1.0;

        if (city.equals("Sofia")){
            if (sales >= 0 && sales <= 500){
                commision = 0.05;
            }else if (sales > 500 && sales <= 1000){
                commision = 0.07;
            }else if (sales > 1000 && sales <= 10000){
                commision = 0.08;
            }else if (sales > 10000){
                commision = 0.12;
            }
        }else if (city.equals("Varna")) {
            if (sales >= 0 && sales <= 500) {
                commision = 0.045;
            } else if (sales > 500 && sales <= 1000) {
                commision = 0.075;
            } else if (sales > 1000 && sales <= 10000) {
                commision = 0.100;
            } else if (sales > 10000) {
                commision = 0.130;
            }
        }else if (city.equals("Plovdiv")) {
            if (sales >= 0 && sales <= 500) {
                commision = 0.055;
            } else if (sales > 500 && sales <= 1000) {
                commision = 0.080;
            } else if (sales > 1000 && sales <= 10000) {
                commision = 0.120;
            } else if (sales > 10000) {
                commision = 0.145;
            }
        }
        if (commision >= 0){
            System.out.printf("%.2f", sales * commision);
        }else{
            System.out.println("error");
        }
    }
}
