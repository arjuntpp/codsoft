import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter number of subjects: ");
        int numSubjects = scanner.nextInt();

        double totalMarks = 0;
        double totalMaxMarks = 0;

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter subject " + (i + 1) + " name: ");
            String subjectName = scanner.next();

            System.out.print("Enter " + subjectName + " marks obtained: ");
            double marksObtained = scanner.nextDouble();

            System.out.print("Enter " + subjectName + " maximum marks: ");
            double maxMarks = scanner.nextDouble();

            totalMarks += marksObtained;
            totalMaxMarks += maxMarks;

            System.out.println();
        }

        double percentage = (totalMarks / totalMaxMarks) * 100;

        System.out.println("Student Name: " + name);
        System.out.println("Total Marks Obtained: " + totalMarks);
        System.out.println("Total Maximum Marks: " + totalMaxMarks);
        System.out.println("Percentage: " + String.format("%.2f", percentage));

        if (percentage >= 90) {
            System.out.println("Grade: A+");
        } else if (percentage >= 80) {
            System.out.println("Grade: A");
        } else if (percentage >= 70) {
            System.out.println("Grade: B+");
        } else if (percentage >= 60) {
            System.out.println("Grade: B");
        } else if (percentage >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
    }
}


