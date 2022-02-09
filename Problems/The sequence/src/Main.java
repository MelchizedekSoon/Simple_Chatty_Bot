import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int noe = scanner.nextInt();
        int max = 0;

        while (noe > 0 && noe < 1000) {
            int input = scanner.nextInt();
            if (max < input && input % 4 == 0 && input < 3000) {
                max = input;
            }
            noe--;
        }

        System.out.println(max);
    }
}