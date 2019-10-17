import java.util.Scanner;

public class ProjectCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine ();
        int projectsCount = Integer.parseInt (scanner.nextLine());
        int hours = projectsCount * 3;
        System.out.println(
                String.format("The architect %s will need %d hours to complete %d project/s.", firstName, hours, projectsCount));
    }
}
