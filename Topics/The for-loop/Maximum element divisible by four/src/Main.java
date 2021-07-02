import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int loops = scanner.nextInt();
        int maxElement = 0;
        for (int i = 0; i < loops; i++) {
            int temp = scanner.nextInt();
            if (temp % 4 == 0 && temp > maxElement) {
                maxElement = temp;
            }
        }
        System.out.println(maxElement);
    }
}