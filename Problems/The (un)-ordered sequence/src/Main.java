import java.util.NoSuchElementException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int first = -1;
        int second = -1;
        boolean asc = false;
        boolean dsc = false;
        boolean notZero = false;
        boolean isOrdered = false;
        try {
            first = scanner.nextInt();
            second = scanner.nextInt();
        } catch (NoSuchElementException e) {

        }
        if (first != 0) {
            isOrdered = true;
        }



        while (!notZero && scanner.hasNextInt()) {
            if (first == second) {
                first = second;
                second = scanner.nextInt();

            }
            if (first < second) {
                if (dsc) {
                    isOrdered = false;
                    break;
                }
                if (!dsc) {
                    asc = true;
                    isOrdered = true;
                    first = second;
                    second = scanner.nextInt();
                }
            } else if (first > second) {
                if (asc) {
                    isOrdered = false;
                    break;
                }
                if (!asc) {
                    dsc = true;
                    isOrdered = true;
                    first = second;
                    second = scanner.nextInt();
                }
            }
        }

        System.out.println(isOrdered);
    }
}
