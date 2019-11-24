import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String food = scanner.nextLine();

        String output = "unknown";

        boolean isFruit = food.equals("banana") || food.equals("apple")
                || food.equals("kiwi") || food.equals("cherry")
                || food.equals("lemon") || food.equals("grapes");

        boolean isVegetable = food.equals("tomato") || food.equals("cucumber")
                || food.equals("pepper") || food.equals("carrot");
        if(isFruit){
            output = "fruit";
        }else if(isVegetable){
            output = "vegetable";
        }
        System.out.println(output);
    }
}
