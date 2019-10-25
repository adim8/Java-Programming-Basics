import java.util.Scanner;

public class DanceHall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double wardrobeSide = Double.parseDouble(scanner.nextLine());
        double areaHall = (length *100)*(width*100);
        double areaWardrobe = (wardrobeSide * 100) * (wardrobeSide * 100);
        double bench = areaHall / 10;
        double dancersArea = 40;
        double dancersClearArea= 7000;
        double areaClearHall = areaHall - bench - areaWardrobe;
        double dancersFullArea = dancersArea + dancersClearArea;
        double dancersNumber = areaClearHall / dancersFullArea;
        System.out.printf("%.0f", Math.floor(dancersNumber));
    }

}
