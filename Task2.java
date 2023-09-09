                                            //TASK 2
                           //STUDENT GRADE CALCULATOR
package ArshiAnjum;
import java.util.Scanner;
public class Task2 {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print(" STUDENT GRADE CALCULATOR \n\n ");
System.out.print("Enter the number of subjects::");
int numSubjects = scanner.nextInt();

int totalMarks = 0;
int[] subjectMarks = new int[numSubjects];

for (int i = 0; i < numSubjects; i++) {
System.out.print("Enter marks obtained in subject " + (i + 1) + "::");
subjectMarks[i] = scanner.nextInt();
totalMarks += subjectMarks[i];
}

double averagePercentage = (double) totalMarks / numSubjects;

String grade;

if (averagePercentage >= 90) {
grade = "A";
} else if (averagePercentage >= 80) {
grade = "B";
} else if (averagePercentage >= 70) {
grade = "C";
} else if (averagePercentage >= 60) {
grade = "D";
} else {
grade = "F";
}

System.out.println("\nRESULT:-");
System.out.println("Total Marks:: " + totalMarks);
System.out.println("Average Percentage::" + averagePercentage + "%");
System.out.println("Grade:: " + grade);

scanner.close();
}

}