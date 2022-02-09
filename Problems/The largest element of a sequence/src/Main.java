import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int storage = 0;
        while (scanner.hasNextInt()) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            if (input > storage) {
                storage = input;
            }
        }

        System.out.println(storage);
    }
}
