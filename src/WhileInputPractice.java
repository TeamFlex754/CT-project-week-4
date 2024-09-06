import java.util.Scanner;

public class WhileInputPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userNum;

        System.out.println("Enter a number: ");
        userNum = scanner.nextInt();

        while (userNum >= 0) {
            System.out.println("Enter another number: ");
            userNum = scanner.nextInt();
        }
        System.out.println("Done.");
    }
}
