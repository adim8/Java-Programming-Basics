import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogsCount = Integer.parseInt (scanner.nextLine());
        int otherAnimals = Integer.parseInt (scanner.nextLine());
        double totalSum = dogsCount * 2.5 + otherAnimals * 4;
        System.out.printf("%.2f lv.", totalSum);
    }

}
