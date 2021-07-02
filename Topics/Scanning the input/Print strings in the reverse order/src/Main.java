import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String first = scan.nextLine();
        String second = scan.nextLine();
        String third = scan.nextLine();
        scan.close();
        System.out.println(third);
        System.out.println(second);
        System.out.println(first);
    }
}
