package newChapter5Practice;
/*5.17 (Student Grades) A group of five students earned the following grades: Student 1, ‘A’; student 2,
C’; student 3, ‘B’; student 4, ‘A’ and student 5, ‘B’. Write an application that reads a series
of pairs of numbers as follows:
a) student name
b) student letter grade
Your program should use a switch statement to determine how many students got a grade of ‘A’,
how many got a grade of ‘B’, how many got a grade of ‘C’, and how many got a grade of ‘D’. Use a
loop as needed to input the five student grades, and then finally display the results.*/

import java.util.Scanner;

public class StudentsGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter -1 to quit:");
        //System.out.println("Enter student's name:");

        int userInput = 0;

        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int eCount = 0;
        int gradeCounter = 0;
        int total = 0;

        while (userInput != -1){
            //System.out.println("Enter student's name:");
            //String studentsName = input.nextLine();

            System.out.println("Enter grade:");
            int studentGrade = input.nextInt();
            total +=studentGrade;
            gradeCounter++;

            switch (studentGrade / gradeCounter) {
                case 10, 9, 8 -> aCount++;
                case 7 -> bCount++;
                case 6, 5 -> cCount++;
                case 4 -> dCount++;
                default -> eCount++;
            }
        }
        System.out.printf("%d students scored A%n%d students scored B%n%d students scored C%n%d students scored D%n%d students failed the course",aCount,bCount,cCount,dCount);
    }
}
