import java.util.NoSuchElementException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws NoSuchElementException {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int fixed = 0;
        int reject = 0;
        int ship = 0;
        for (int i = 0; i < input; i++) {
            switch (scanner.nextInt()) {
                case 0:
                    ship++;
                    break;
                case -1:
                    reject++;
                    break;
                case 1:
                    fixed++;
                    break;
            }
        }

        System.out.println(ship + " " + fixed + " " + reject);
    }
}
