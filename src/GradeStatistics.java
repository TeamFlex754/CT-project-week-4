import java.util.Scanner;

public class GradeStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables to store grades
        int numTotalGrades = 10;
        float maxGrade = 0;
        float minGrade = 100;
        float gradeSum = 0;
        float userGrade;
        float averageGrade;

        // For-loop for user grade input and organizing values as floats
        for (int i = 0; i < numTotalGrades; i++) {
            System.out.println("Enter your grade " + (i + 1) + ": ");
            userGrade = scanner.nextFloat();  // Sets input as userGrade

            if (userGrade > maxGrade) {
                maxGrade = userGrade;
            }
            if (userGrade < minGrade) {
                minGrade = userGrade;
            }
            gradeSum += userGrade;  // Sums userGrade values and sets as new variable gradeSum
        }
        averageGrade = gradeSum / numTotalGrades;  // Equation for average

        System.out.println("The max grade is: " + maxGrade);
        System.out.println("The min grade is: " + minGrade);
        System.out.println("The average grade is: " + averageGrade);
    }
}
