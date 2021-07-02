import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int goUp = scanner.nextInt();
        int goDown = scanner.nextInt();
        int position = 0;
        int day = 1;
        for (int i =0; i )
        if ((position + goUp) <= height) {
            position = position + goUp - goDown;
            day++;
        }


    }
}