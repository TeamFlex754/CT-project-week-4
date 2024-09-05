import java.util.Scanner;

public class GradeStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numTotalGrades = 10;
        float maxGrade = 0;
        float minGrade = 100;
        float gradeSum = 0;
        float userGrade;
        float averageGrade;


        for (int i = 0; i < numTotalGrades; i++) {
            System.out.println("Enter your grade " + (i + 1) + ": ");
            userGrade = scanner.nextFloat();

            if (userGrade > maxGrade) {
                maxGrade = userGrade;
            }
            if (userGrade < minGrade) {
                minGrade = userGrade;
            }
            gradeSum += userGrade;
        }
        averageGrade = gradeSum / numTotalGrades;

        System.out.println("The max grade is: " + maxGrade);
        System.out.println("The min grade is: " + minGrade);
        System.out.println("The average grade is: " + averageGrade);
    }
}
