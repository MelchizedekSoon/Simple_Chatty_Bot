import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int counter = 1;
        int matcher = a;
        int total = 0;
        for (int i = 0; matcher < h; i++) {
            matcher = matcher - b;
            matcher = matcher + a;
            total += matcher;
            counter++;
        }
        System.out.println(counter);
    }
}
