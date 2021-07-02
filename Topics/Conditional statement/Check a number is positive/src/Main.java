import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        if (input > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}