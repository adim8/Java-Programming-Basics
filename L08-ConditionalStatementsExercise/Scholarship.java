import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double income = Double.parseDouble(scanner.nextLine());
        double evaluation = Double.parseDouble(scanner.nextLine());
        double minSalary = Double.parseDouble(scanner.nextLine());

        double sucsessScholarship = Math.floor(evaluation * 25);
        double socialScholarship = Math.floor(0.35 * minSalary);

        if (evaluation < 4.5) {
            System.out.print("You cannot get a scholarship!");
        } else if (evaluation >= 5.5) {
            if (income < minSalary) {
                if (socialScholarship > sucsessScholarship) {
                    System.out.printf("You get a Social scholarship %.0f BGN", socialScholarship);
                } else {
                    System.out.printf("You get a scholarship for excellent results %.0f BGN", sucsessScholarship);
                }
            } else {
                System.out.printf("You get a scholarship for excellent results %.0f BGN", sucsessScholarship);
            }
        } else if (evaluation >= 4.5 && evaluation < 5.5) {
            if (income >= minSalary) {
                System.out.print("You cannot get a scholarship!");
            } else {
                System.out.printf("You get a Social scholarship %.0f BGN", socialScholarship);
            }
        }
    }
}