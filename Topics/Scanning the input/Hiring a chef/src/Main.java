import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        sc.nextLine();
        sc.nextLine();
        sc.nextLine();
        String dishes = sc.nextLine();
        sc.close();
        System.out.printf("The form for %s is completed. We will contact you if we need a chef that cooks %s dishes.",
            name, dishes);
    }
}
