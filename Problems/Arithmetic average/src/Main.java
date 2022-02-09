import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int low = scanner.nextInt();
        int high = scanner.nextInt();
        int result = 0;
        int tally = 0;
        
        for (; low <= high; low++) {
            if (low % 3 == 0) {
                result += low;
                tally++;
            }
        }
        
        double finalResult = ((double) result / tally);
        System.out.println(finalResult);

    }
}
