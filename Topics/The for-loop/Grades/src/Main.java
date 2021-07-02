import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int loops = scanner.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        for (int i = 0; i < loops; i++) {
            int temp = scanner.nextInt();
            switch (temp) {
                case 5:
                    a++;
                    break;
                case 4:
                    b++;
                    break;
                case 3:
                    c++;
                    break;
                case 2:
                    d++;
                    break;
                default:
                    break;
            }
        }
        scanner.close();
        System.out.println(d + " " + c + " " + b + " " + a);
    }
}