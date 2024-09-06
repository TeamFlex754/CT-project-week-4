import java.util.Scanner;

public class PracticeProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float userValue;
        float total = 0.0f;
        float avg;
        float max = Float.MIN_VALUE;
        float min = Float.MAX_VALUE;
        float interestOnTotal;
        int count = 0;

        while (count < 5) {
            System.out.println("Enter value " + (count + 1) + ": ");
            userValue = scanner.nextFloat();
            total += userValue;

            if (userValue > max) {
                max = userValue;
            }
            if (userValue < min) {
                min = userValue;
            }
            count++;


        }
        avg = total / 5;
        interestOnTotal = total * 0.20f;

        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Interest on total at 20%: " + interestOnTotal);


    }
}
