import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;

        for (int i = 1; count <= number; i++) {
            for (int j = 1; j <= i; j++) {
                count++;
                if (count <= number) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}