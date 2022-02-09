import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        first = first.replaceAll("\\s", "");
        String second = scanner.nextLine();
        second = second.replaceAll("\\s", "");
        if (first.equals(second)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
