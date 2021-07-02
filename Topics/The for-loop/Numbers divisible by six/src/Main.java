import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int loops = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < loops; i++) {
            int temp = scanner.nextInt();
            if (temp % 6 == 0) {
                sum += temp;
            }
        }
        scanner.close();
        System.out.println(sum);
    }
}