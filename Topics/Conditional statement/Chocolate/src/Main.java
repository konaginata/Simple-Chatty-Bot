import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int k = scan.nextInt();
        scan.close();

        if (k < n * m && (k >= n || k >= m) && (n % k == 0 || m % k == 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}