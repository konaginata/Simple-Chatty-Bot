import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i1 = scanner.nextInt();
        int i2 = scanner.nextInt();
        int i3 = scanner.nextInt();
        int count = 0;
        if (i1 > 0) count++;
        if (i2 > 0) count++;
        if (i3 > 0) count++;
        System.out.println(count == 1 ? "true" : "false");
    }
}