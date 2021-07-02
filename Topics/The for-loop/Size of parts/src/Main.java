import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int loops = scanner.nextInt();
        int fixed = 0;
        int rejected = 0;
        int ready = 0;
        for (int i = 0; i < loops; i++) {
            int temp = scanner.nextInt();
            if (temp == 1) {
                fixed++;
            } else if (temp == -1) {
                rejected++;
            } else if (temp == 0) {
                ready++;
            }
        }
        scanner.close();
        System.out.println(ready + " " + fixed + " " + rejected);
    }
}