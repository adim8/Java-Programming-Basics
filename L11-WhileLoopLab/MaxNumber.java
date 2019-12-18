import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int counter = 0;

        int maxNum = Integer.MIN_VALUE;
        while (counter < n) {

            int num = Integer.parseInt(scanner.next());

            if (maxNum < num) {
                maxNum = num;
            }

            counter++;
        }
        System.out.println(maxNum);
    }
}
