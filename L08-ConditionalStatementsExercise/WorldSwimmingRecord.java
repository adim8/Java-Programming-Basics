import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double timePerMeterInSeconds = Double.parseDouble(scanner.nextLine());

        double totalTime = distanceInMeters * timePerMeterInSeconds;
        double delay = Math.floor(distanceInMeters / 15) * 12.5;

        double finalTime = totalTime + delay;

        if (recordInSeconds > finalTime) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", finalTime);
        } else {
            double diff = finalTime - recordInSeconds;
            System.out.printf("No, he failed! He was %.2f seconds slower.", diff);
        }
    }
}
